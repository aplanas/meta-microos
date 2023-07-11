SUMMARY = "RELAX NG Datatype API"
DESCRIPTION = "RELAX NG is a public space for test cases and other ancillary software \
related to the construction of the RELAX NG language and its \
implementations."
LICENSE = "BSD-3-Clause"

PV = "2011.1"

RPM_NAME = "relaxngDatatype-2011.1-5.7.noarch.rpm"
RPM_HASH = "1f5b61cf6556c39fc3c7993f067c70e672a90af4689ae30cf31af820fa3d445aa8062297ec17d42b802e52d7c84268525e5d22f6d6c0e8764f5bdd8fb43331aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.github.relaxng-relaxngDatatype \
mvn-com.github.relaxng-relaxngDatatype-pom- \
mvn-relaxngDatatype-relaxngDatatype \
mvn-relaxngDatatype-relaxngDatatype-pom- \
relaxngDatatype"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
