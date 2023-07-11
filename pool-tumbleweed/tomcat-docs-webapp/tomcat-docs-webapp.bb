SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-docs-webapp-9.0.75-1.2.noarch.rpm"
RPM_HASH = "89ffe593999943597f29b6a896bb11c7b5e09a399886ec152a18d57ae8b1fd6fa8eb2387e6a99bed47f94280dc5ad57f7de4b045d9e5a9fbb307f758fc8819d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-docs-webapp"

RDEPENDS:${PN} += "/usr/bin/sh \
tomcat"

inherit rpm
