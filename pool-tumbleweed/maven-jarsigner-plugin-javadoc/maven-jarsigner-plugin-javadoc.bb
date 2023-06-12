SUMMARY = "API documentation for maven-jarsigner-plugin"
DESCRIPTION = "This package contains the API documentation for maven-jarsigner-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jarsigner-plugin-javadoc-3.0.0-3.21.noarch.rpm"
RPM_HASH = "1f8823b43e30458bc87a47a8aa475966a5101d8f807723386f0c5d6630c35e0884550a2fbdfc49281e6b0eb0a93535cb9a5f9fb1afeb6441d9dbf69276543916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jarsigner-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
