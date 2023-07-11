SUMMARY = "Small java library for generating META-INF/services files"
DESCRIPTION = "This package contains small Java library which can be used \
for automatic generation of META-INF/services files."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-1.9-1.11.noarch.rpm"
RPM_HASH = "98efa72fef9f0a9a44884be21edddea7926387dfb09feac72173becce9cb79f1faf7397a5cb6883edbc50c78a184c88500c0fedbec2c597267b99410070d565d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services \
mvn-org.kohsuke.metainf-services-metainf-services \
mvn-org.kohsuke.metainf-services-metainf-services-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
