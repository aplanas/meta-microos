SUMMARY = "Development files for libtranscript, a character conversion library"
DESCRIPTION = "libtranscript is a character set conversion library which allows \
great control over the conversion. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libtranscript."
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "libtranscript-devel-0.3.3-2.15.aarch64.rpm"
RPM_HASH = "c8b109e6be3b0fe601e348d8eb2fa1d525d54372adcd98452558a74934d2ece13883084b9efd43ae75a8017e32c795b53c866f78c1b9708a511ff76b3c6d5673"

RPROVIDES:${PN} += "libtranscript-devel \
pkgconfig-libtranscript"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtranscript1"

inherit rpm
