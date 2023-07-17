SUMMARY = "Documentation for qt6-speech in QCH format"
DESCRIPTION = "This package contains documentation for qt6-speech in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-speech-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "eb76b9d23b561d7ae7aaa18950dff8fd8a3d1de748eb53fc15c8a9c11f8dfb1df93de8fca06a5d335565778f32428a9eca4862868333989aaabb990b5cbadae6"

RPROVIDES:${PN} += "qt6-speech-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
