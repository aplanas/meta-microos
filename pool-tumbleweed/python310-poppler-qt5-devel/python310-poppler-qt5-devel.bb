SUMMARY = "Devel package for python310-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python310-poppler-qt5-devel-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "c3a511d45ae0a9304b0a8b5d9fb66b9ccaa18630db48c534d5c69476c281215cae6da1f0b760746eaa65b0f0dc4692abf82209064fb44942af5b95f60ca71767"

RPROVIDES:${PN} += "python3-poppler-qt5-devel \
python310-poppler-qt5-devel"

RDEPENDS:${PN} += "libpoppler-qt5-devel \
python310-qt5-devel \
python310-sip-devel"

inherit rpm
