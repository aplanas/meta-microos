SUMMARY = "A character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion."
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "libtranscript1-0.3.3-2.14.aarch64.rpm"
RPM_HASH = "ab9347e7670ede7aaf2450bddc5dccb94dd0e40cf72a3d86c94a0cb9c9a025eec11d9f8aa35b061efbf9125840cca7969493460ef9f331d5ec6348e06535098b"

RPROVIDES:${PN} += "libtranscript.so.1()(64bit) \
libtranscript1 \
libtranscript1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
