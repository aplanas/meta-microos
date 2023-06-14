SUMMARY = "AutoService Annotations"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-annotations-1.6.1-1.10.noarch.rpm"
RPM_HASH = "ab65cd241b0447c3dffc414fce09fdebaaa7c9a8a39a1e30530a8b06eba93bc7044758a2eec0d93e91669b112a6a7bd686f9ad563b78feb2e733c3571f339eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
