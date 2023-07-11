SUMMARY = "Include files for libtpms"
DESCRIPTION = "Libtpms header files and documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "libtpms-devel-0.9.6-1.4.aarch64.rpm"
RPM_HASH = "f0c858815b281bcbb257d2abee13c1394a345262e3d2514716f1c1b1227479561fcb5b6fe3c42dbdf83c044d78baf5f2222026209252af04c54ddfe068dedee2"

RPROVIDES:${PN} += "libtpms-devel \
pkgconfig-libtpms"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenssl-devel \
libtpms0 \
mozilla-nspr-devel"

inherit rpm
