SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "wireless-tools-30.pre9-40.7.aarch64.rpm"
RPM_HASH = "c1d99b8c08da24f7f9d79c93fc4b83d40df6fc9fa7d3a7d60344be23f684e817d025ffef598f58771b00e4a4ecc1d29373786a9fc751d55f7a7fe5b672e5602f"

RPROVIDES:${PN} += "wireless-tools"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libiw \
libiw.so.30 \
libm.so.6"

inherit rpm
