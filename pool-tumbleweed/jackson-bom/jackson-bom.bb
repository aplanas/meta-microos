SUMMARY = "Bill of materials POM for Jackson projects"
DESCRIPTION = "A 'bill of materials' POM for Jackson dependencies."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-bom-2.15.2-1.1.noarch.rpm"
RPM_HASH = "3792dffd64e16b62fe6532fd404243dc55e097f147c8e2d222dcc9bd5ffb633e859bc720c3482079be19240a9e000b1d8c772156bd0e1e6b8310e30de1af7e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-bom \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson-jackson-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

inherit rpm
