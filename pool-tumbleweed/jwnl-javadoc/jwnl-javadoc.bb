SUMMARY = "Javadoc for jwnl"
DESCRIPTION = "This package contains javadoc for jwnl."
LICENSE = "BSD-3-Clause"

PV = "1.4~rc3"

RPM_NAME = "jwnl-javadoc-1.4~rc3-2.10.noarch.rpm"
RPM_HASH = "631c4f953a62abdcbd5b4d3d3339b36a6b73bd461c11e067db798d0af938255eb420077e1942017e7afdea9caec71385b8c83b16689e21ad75543d9f3f9b4c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwnl-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
