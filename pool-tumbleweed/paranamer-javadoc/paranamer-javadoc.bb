SUMMARY = "Javadoc for paranamer"
DESCRIPTION = "This package contains the API documentation for paranamer."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-javadoc-2.8-3.1.noarch.rpm"
RPM_HASH = "ed43d1bb8bf08ab2d99a8093540ffbc34608912925d035722fb50d5484284910ee5c424a666cbfb88167cb8da137a75f3e20d45bf6bb0a5c38caca80371656f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paranamer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
