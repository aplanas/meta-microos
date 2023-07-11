SUMMARY = "A collection of source code generators for Java"
DESCRIPTION = "The Auto sub-projects are a collection of code generators \
that automate those types of tasks."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-1.6.1-1.11.noarch.rpm"
RPM_HASH = "9590fc33c389350f8e1bb40647a27c0ab5cea1e8731e281fb12b96014421fe8c813b5815294842e6b58d6cf5ac9a29cd158e5c4c810bd2bae256130cc0b04b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto \
mvn-com.google.auto-auto-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
