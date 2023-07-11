SUMMARY = "Devel package for python39-poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained. \
 \
This package contains the SIP and Qscintilla API files to build \
python packages using python-poppler"
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python39-poppler-qt5-devel-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "63ac4a2e5da41b0ec900bfac6d6ebe7251ee431a97381d0147744d7e8bcce919f5475e456b434f89d742b6a94e55fbd6c907349a20e4741ee3c9eb25d106f082"

RPROVIDES:${PN} += "python39-poppler-qt5-devel"

RDEPENDS:${PN} += "libpoppler-qt5-devel \
python39-qt5-devel \
python39-sip-devel"

inherit rpm
