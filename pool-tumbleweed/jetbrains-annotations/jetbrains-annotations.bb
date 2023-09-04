SUMMARY = "IntelliJ IDEA Annotations"
DESCRIPTION = "A set of annotations used for code inspection support and code documentation."
LICENSE = "Apache-2.0"

PV = "23.0.0"

RPM_NAME = "jetbrains-annotations-23.0.0-2.1.noarch.rpm"
RPM_HASH = "3eafdcf3e932418781ce5f12d94e71191f625e5574a409d94bda1e73e853f93c93c1457cb94f137195292cae6cd8863437f6289e8644083f303c394facc8ad45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-annotations \
mvn-com.intellij-annotations \
mvn-com.intellij-annotations-pom- \
mvn-org.jetbrains-annotations \
mvn-org.jetbrains-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
