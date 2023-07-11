SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cpp7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "416488e112b70e54515a91dc5efca20429df0ba78d08beaa235d8458dee0c566550b18809cad6ce1b15c03b501e4baf156f35b2e574a5ea5f5c5336b9f61a5ca"

RPROVIDES:${PN} += "cpp7"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
