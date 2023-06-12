SUMMARY = "PPTP plugin for connman"
DESCRIPTION = "Provides PPTP support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-pptp-1.41-4.7.aarch64.rpm"
RPM_HASH = "f28e33591d00652c4609eba1581557dc768f6d8c891ce5e1dc7dc504a1da46dc0c72e52037e75704b31c0504d5ead3506956438cf6bb9fd41749eb74043aea6b"

RPROVIDES:${PN} += "connman-plugin-pptp \
connman-plugin-pptp(aarch-64)"
RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
