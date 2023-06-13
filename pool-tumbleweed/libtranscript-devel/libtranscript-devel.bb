SUMMARY = "Development files for libtranscript, a character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libtranscript."
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "libtranscript-devel-0.3.3-2.14.aarch64.rpm"
RPM_HASH = "c624db39a873a594974eddd186a858175745fba1f5bf5d37146e8e8ee2d6c99bcb84c25cbe18b753242073b97240547d327d2b4bcf8636d68a4aac1faad9c8b6"

RPROVIDES:${PN} += "libtranscript-devel \
libtranscript-devel(aarch-64) \
pkgconfig(libtranscript)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtranscript1"

inherit rpm
