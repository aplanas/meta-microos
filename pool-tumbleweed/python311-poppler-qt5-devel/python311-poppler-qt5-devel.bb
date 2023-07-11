SUMMARY = "Devel package for python311-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python311-poppler-qt5-devel-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "d340028050c08e6a2179e0915db28d7072585123d6dd85cdacd714758981073ab556b3266cb3b905e51b9356f369e39f1c5c76a4ac451c7858157bd5edd6e832"

RPROVIDES:${PN} += "python3-poppler-qt5-devel \
python311-poppler-qt5-devel"

RDEPENDS:${PN} += "libpoppler-qt5-devel \
python311-qt5-devel \
python311-sip-devel"

inherit rpm
