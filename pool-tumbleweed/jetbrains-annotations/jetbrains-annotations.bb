SUMMARY = "IntelliJ IDEA Annotations"
DESCRIPTION = "A set of annotations used for code inspection support and code documentation."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-23.0.0-1.4.noarch.rpm"
RPM_HASH = "17cd49c10efdc164c4eb12e0a098b0686c2e6e276c661cdfde5424c8a94f899b2df67b231816204ab87206393e656e872c93f186d643cf053c50938a310ccaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations \
mvn-com.intellij-annotations \
mvn-com.intellij-annotations-pom- \
mvn-org.jetbrains-annotations \
mvn-org.jetbrains-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
