SUMMARY = "Javadocs for antlr-maven-plugin"
DESCRIPTION = "This package contains the API documentation for antlr-maven-plugin."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-javadoc-2.2-3.11.noarch.rpm"
RPM_HASH = "3f311818e221bbef85973f33419350396240a8dab5e7b38e05ed3890e96d3c30fb567c0b158c235f2dee0026a6e756cdd308a27d1fd9ee5638cc8588ae2b8a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
