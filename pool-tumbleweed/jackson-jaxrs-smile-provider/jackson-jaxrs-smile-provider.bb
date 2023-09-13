SUMMARY = "Jackson-JAXRS-Smile"
DESCRIPTION = "Functionality to handle Smile (binary JSON) input/output for \
JAX-RS implementations (like Jersey and RESTeasy) using standard \
Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-smile-provider-2.15.2-2.1.noarch.rpm"
RPM_HASH = "1f0f84d12abefa023ff599c341c0d1e9f3f93988044cbffc1e2023e2ad26f1c1b83eea967081ce454a3ca811fe13f1407d77b3888c9ba762c0fd27714df9ed24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-smile-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-smile-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
