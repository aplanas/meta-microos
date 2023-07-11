SUMMARY = "Development files for libxtrx"
DESCRIPTION = "High level XTRX API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrx."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx-devel-0.0.0+git.20201202-3.8.aarch64.rpm"
RPM_HASH = "4d38942928ab32d29a36c140fcd7f60192ee089efca1e30272cf850bc24c84d0c4cc3f407afe6a090c898df9b112575c28b3b9fd6279a3a39daf5fb33d4a76c7"

RPROVIDES:${PN} += "libxtrx-devel \
pkgconfig-libxtrx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrx0"

inherit rpm
