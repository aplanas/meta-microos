SUMMARY = "Documentation for qt6-datavis3d in HTML format"
DESCRIPTION = "This package contains documentation for qt6-datavis3d in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavis3d-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6a22e5365f22159c3562fe0a4bd4429e5300a18fd0418665e7bc91f37969cf4b404c6c1281d4708b7ea0d5bcefe195ee12dc4ba8995c7850f6939771e32cfad1"

RPROVIDES:${PN} += "qt6-datavis3d-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
