SUMMARY = "Development files for libxtrxdsp"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxdsp."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp-devel-0.0.0+git.20190830-2.6.aarch64.rpm"
RPM_HASH = "570cdd465ac1877c157868f57f7feeff815e45f625029f30eaf300ed2d0685b12c893df3e724eeb90bc88eb67ee417ca5de6e64c0c79a8a7dc591b6301051871"

RPROVIDES:${PN} += "libxtrxdsp-devel \
libxtrxdsp-devel(aarch-64) \
pkgconfig(libxtrxdsp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxdsp0"

inherit rpm
