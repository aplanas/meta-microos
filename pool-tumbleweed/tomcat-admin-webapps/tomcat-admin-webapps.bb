SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-admin-webapps-9.0.75-1.2.noarch.rpm"
RPM_HASH = "c9eefcf1303791272a800838dac274626bde48caf7983edcc3023314eee53de385047dcff859b738eb5f138aa6378288bdc5e5279d365340157df1a5cb47b054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-admin-webapps \
tomcat-admin-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
tomcat"

inherit rpm
