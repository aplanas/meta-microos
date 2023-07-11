SUMMARY = "PulseAudio zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-zsh-completion-16.1-4.1.aarch64.rpm"
RPM_HASH = "dd1456f284c6577b3b4363a77affb39792472b2933a55ee137d094b292d59e6e78b1ea7778e8e3617bf2403816166664c05c18e3e62ec6fa3e3297db5a23b868"

RPROVIDES:${PN} += "pulseaudio-zsh-completion"

RDEPENDS:${PN} += "pulseaudio-utils \
zsh"

inherit rpm
