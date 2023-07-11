SUMMARY = "API documentation for maven-jarsigner-plugin"
DESCRIPTION = "This package contains the API documentation for maven-jarsigner-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jarsigner-plugin-javadoc-3.0.0-3.22.noarch.rpm"
RPM_HASH = "4788f8d15be962d31c8e10589b3820da5900493745b70ce36d9a74070aa276c275e7b6dc89b16272eee5f1a0976502671388566f09d281d11f326cf36ca81651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jarsigner-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
