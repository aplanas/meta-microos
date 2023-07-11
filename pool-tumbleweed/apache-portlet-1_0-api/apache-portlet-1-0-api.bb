SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 ."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-1.0-113.19.noarch.rpm"
RPM_HASH = "5e2e561611204e20cbaf90b8fb38690c4028d0a7027788302ac7f93f2b9b9fc6b6de5984816a93d796bfafc3432af3fec928aa424021cc86f1951ac544a40fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api \
mvn-javax.portlet-portlet-api \
mvn-javax.portlet-portlet-api-pom- \
portlet \
portlet-1.0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
