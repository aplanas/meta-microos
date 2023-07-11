SUMMARY = "A character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion."
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "libtranscript1-0.3.3-2.15.aarch64.rpm"
RPM_HASH = "0205b288972ecba302f40e86b38954bf6fe97a67612a8cfa418c189c3d0381b67812cf0a359bd9d712923ea7d42ab4dfee93974cff5711dcd3ee1d7b4ed246e6"

RPROVIDES:${PN} += "libtranscript.so.1 \
libtranscript1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
