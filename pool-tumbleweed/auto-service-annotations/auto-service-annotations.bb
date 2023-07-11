SUMMARY = "AutoService Annotations"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-annotations-1.6.1-1.11.noarch.rpm"
RPM_HASH = "fc375a2f04402fd6623c07a96fa227b1d85491e14a190668c0f0470c93bd7e54af91549cdc9ca99261dd8dfbc3d44c952b7ebf0db66a76663412ff03786ad6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
