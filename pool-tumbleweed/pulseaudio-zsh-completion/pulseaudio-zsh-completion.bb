SUMMARY = "PulseAudio zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-zsh-completion-16.1-3.1.aarch64.rpm"
RPM_HASH = "b761ae26942cf4880ab492645b08cab6403eef47fba9acbc7ccd7af397314284869223f0811a98051b4949a33253cc207259eff68d94f3dacf0d0840185bcd41"

RPROVIDES:${PN} += "pulseaudio-zsh-completion"

RDEPENDS:${PN} += "pulseaudio-utils \
zsh"

inherit rpm
