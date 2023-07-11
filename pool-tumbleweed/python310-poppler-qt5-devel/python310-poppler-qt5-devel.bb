SUMMARY = "Devel package for python310-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python310-poppler-qt5-devel-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "8d5bd5776bae9f30f2cb363527a2aa8aa25711a68c9c630557c4e358832c2220501010eaf42d3f3640352dd3e6b75f2380ba35459093fc2c8c377a2029b5cf20"

RPROVIDES:${PN} += "python310-poppler-qt5-devel"

RDEPENDS:${PN} += "libpoppler-qt5-devel \
python310-qt5-devel \
python310-sip-devel"

inherit rpm
