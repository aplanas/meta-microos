SUMMARY = "NetworkManager VPN support for PPTP"
DESCRIPTION = "NetworkManager-pptp provides VPN support to NetworkManager for PPTP."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-pptp-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "b9b33595478779120647e034e7cddede7a5a36b88290b785456560767cf27937b3a7b4beb383e228c4a7a5822b31228ee596386a9cbecf5fda941270903145f0"

RPROVIDES:${PN} += "NetworkManager-pptp \
libnm-vpn-plugin-pptp.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
ppp \
pptp"

inherit rpm
