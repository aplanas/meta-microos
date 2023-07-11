SUMMARY = "Development files for libxtrxdsp"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxdsp."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp-devel-0.0.0+git.20190830-2.7.aarch64.rpm"
RPM_HASH = "19fa472e873a3439f66ac8a9c625da3024c2ebced9c6266f3c906742ff4420805649df17d37a93e951569d5b125be664af572c71d06f4e68b6b91334a3431763"

RPROVIDES:${PN} += "libxtrxdsp-devel \
pkgconfig-libxtrxdsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxdsp0"

inherit rpm
