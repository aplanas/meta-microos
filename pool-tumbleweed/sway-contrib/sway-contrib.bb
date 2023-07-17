SUMMARY = "Contributed scripts for sway"
DESCRIPTION = "Contributed scripts from sway package."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-contrib-1.8.1-3.1.aarch64.rpm"
RPM_HASH = "82b907e0c093eda87060537123e16f79ab73f47881db052c9f14e8a22e57c13e4fd382e507920a2f669ae9a18a074f89d17644621baf4c254af201498deada95"

RPROVIDES:${PN} += "sway-contrib"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
grim \
jq \
python3-i3ipc \
slurp \
sway \
wl-clipboard"

inherit rpm
