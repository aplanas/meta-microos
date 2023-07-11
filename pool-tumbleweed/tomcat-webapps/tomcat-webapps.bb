SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-webapps-9.0.75-1.2.noarch.rpm"
RPM_HASH = "eb6b6134f50ea355e7de84b7b9e27d1444041ece4f428e75f7a1e32b0a89f18fd98f512bc3bec072334e83cf02748babae46b9a592726ecd106c4c62d7ffa60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-webapps \
tomcat-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
jakarta-taglibs-standard \
tomcat"

inherit rpm
