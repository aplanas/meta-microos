SUMMARY = "Javadoc for languagetool-core"
DESCRIPTION = "This package contains javadoc for languagetool-core."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-core-javadoc-4.8-3.2.noarch.rpm"
RPM_HASH = "a0394fb488820cbc38b03e91b6f467a69223fe916d25b355e4bd0a7bde5f050bfed2d3d7795834546cdd36d0964a22a25b08dbde606730b0e48dccf23d1368a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
