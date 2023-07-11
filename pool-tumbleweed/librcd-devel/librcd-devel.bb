SUMMARY = "Development files for librcd, a charset detection library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librcd."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd-devel-0.1.14-4.27.aarch64.rpm"
RPM_HASH = "7404bdda5af0049cbc4b589d8f8286f95b52e56fa5a0697e21cd40a5a49f08cc45c9b6fd785473bad6f4c221a3dce8861f228ca6836c835eb5357c907a136be4"

RPROVIDES:${PN} += "librcd-devel \
pkgconfig-librcd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcd0"

inherit rpm
