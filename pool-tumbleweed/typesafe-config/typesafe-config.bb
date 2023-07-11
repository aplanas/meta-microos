SUMMARY = "Configuration library for JVM languages"
DESCRIPTION = "Configuration library for JVM languages."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "typesafe-config-1.4.1-4.6.noarch.rpm"
RPM_HASH = "d0a631e27eca5b553b6416b2f8a45ee1af9fb7b61e94c3981123cd50d794782fc89764743dd3c961bcb29748326a688f7819540d6e9c0487cdfa36ba2184e7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.typesafe-config \
mvn-com.typesafe-config-pom- \
typesafe-config"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
