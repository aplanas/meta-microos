SUMMARY = "PPTP plugin for connman"
DESCRIPTION = "Provides PPTP support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-pptp-1.41-4.8.aarch64.rpm"
RPM_HASH = "f917bcea72525062858870bc756bf009e7398c16547e638168b4975a397f000e63815cd1f64946d66db4bc36ef58a62fc7d1814f221512eaf7fb408c80917b3f"

RPROVIDES:${PN} += "connman-plugin-pptp"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
