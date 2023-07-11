SUMMARY = "PolicyKit plugin for connman"
DESCRIPTION = "Provides PolicyKit support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-polkit-1.41-4.8.aarch64.rpm"
RPM_HASH = "fb67ba480ff5557610a2d23c325f1071749c6a7c192c58946aa5945476cfb6406e8ae253fe6e33b34f55664843e76f0a73293c6fe619e6fe75d7a64933f83ab7"

RPROVIDES:${PN} += "connman-plugin-polkit"

RDEPENDS:${PN} += "connman \
dbus-1 \
polkit"

inherit rpm
