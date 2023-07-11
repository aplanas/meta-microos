SUMMARY = "VPNC plugin for connman"
DESCRIPTION = "Provides VPNC support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-vpnc-1.41-4.8.aarch64.rpm"
RPM_HASH = "f533a69865ecf6b7284ea963398706a6eb35b60f215521e0cc63853e1d45be4c339d4495e180a6df295fe7fad572f17d48135e2037ef5ed38ef325776967c518"

RPROVIDES:${PN} += "connman-plugin-vpnc"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
vpnc"

inherit rpm
