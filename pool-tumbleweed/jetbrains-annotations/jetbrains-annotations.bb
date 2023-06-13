SUMMARY = "IntelliJ IDEA Annotations"
DESCRIPTION = "A set of annotations used for code inspection support and code documentation."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-23.0.0-1.3.noarch.rpm"
RPM_HASH = "16500b08102f1eee68d3af947ed8c50a41c10fd0b9d74821e07725e6d3cd973f2d85b738d0902e5ad2dd64eec379021825bbbfce43af78379a10738bba8a2535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations \
mvn(com.intellij:annotations) \
mvn(com.intellij:annotations:pom:) \
mvn(org.jetbrains:annotations) \
mvn(org.jetbrains:annotations:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
