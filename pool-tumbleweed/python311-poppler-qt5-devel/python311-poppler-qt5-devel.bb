SUMMARY = "Devel package for python311-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python311-poppler-qt5-devel-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "e6c9a74a4c26a557b3316f33157dfda45ac13d279605782030c2d117a248ef786501edbb925d6592ebcd98f34418e68896b162e9314c0406ad7cd954cd449f2f"

RPROVIDES:${PN} += "python311-poppler-qt5-devel \
python311-poppler-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libpoppler-qt5-devel \
python311-qt5-devel \
python311-sip-devel"

inherit rpm
