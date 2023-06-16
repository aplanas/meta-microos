SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-admin-webapps-9.0.75-1.1.noarch.rpm"
RPM_HASH = "c4e32d72c4f015c26e147473ef5dd30716e95ccfd1839f8f821b19c10fa4dd9293f267bf519725ccc3aeef3585ba792b6bd94cdc7e9022a65260c06840ad2b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-admin-webapps \
tomcat-admin-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
tomcat"

inherit rpm
