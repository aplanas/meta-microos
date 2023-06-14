SUMMARY = "Documentation for qt6-speech in QCH format"
DESCRIPTION = "This package contains documentation for qt6-speech in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-speech-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4797ec4aaefaa62e0936d9dfab3d80e89bb475c8da8d7dd09e735702844e49716f5aaeff4a850418feaf09430a8a9ee2f5d6e8a7f40a33d9abd720778b8468f2"

RPROVIDES:${PN} += "qt6-speech-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
