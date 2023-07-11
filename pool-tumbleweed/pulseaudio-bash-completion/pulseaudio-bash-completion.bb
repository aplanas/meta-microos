SUMMARY = "PulseAudio Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-bash-completion-16.1-4.1.aarch64.rpm"
RPM_HASH = "8501976f378ada126305276772710df0521ef4977e4ba962cbd7fb8acb53d3da8066f25f8ef0ab58b12ca5273250485d4d91d072926e2e3c175086109eabb5e4"

RPROVIDES:${PN} += "pulseaudio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pulseaudio-utils"

inherit rpm
