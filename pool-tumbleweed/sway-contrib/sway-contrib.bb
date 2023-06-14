SUMMARY = "Contributed scripts for sway"
DESCRIPTION = "Contributed scripts from sway package."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-contrib-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "fa2effc87b1eb76a405191f6956c8f45c2b29f62048bb7979531b813015da296d03783157118e51d7de6f35cf53ba012ad16262bf8de2bba16ca68e6688ae0b0"

RPROVIDES:${PN} += "sway-contrib"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
grim \
jq \
python3-i3ipc \
slurp \
sway \
wl-clipboard"

inherit rpm
