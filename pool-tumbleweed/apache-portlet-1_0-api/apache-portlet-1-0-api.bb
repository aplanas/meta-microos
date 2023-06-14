SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 ."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-1.0-113.18.noarch.rpm"
RPM_HASH = "8f8ed6f09d1c5d75776714a21ec1dd6c0b6138905ed58d52c06fcefafac7c916f0aa9998c5efb8ebeb48d591a4e84eee9613f3c07aa678e89e592a7c78631350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api \
mvn-javax.portlet-portlet-api \
mvn-javax.portlet-portlet-api-pom- \
portlet \
portlet-1.0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
