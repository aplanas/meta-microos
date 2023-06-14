SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 4.0/JSP 2.3/EL 3.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.8.0."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-9.0.75-1.1.noarch.rpm"
RPM_HASH = "d63ca87a3a02c0cffc838a0992639cdb00169d12d9b11a9971ac94bcb62168193093cdac4ce2e8b7fd7be9f19be0f7a3ac61edb436f00b5d34b16dce96e0793b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat \
tomcat"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
apache-commons-daemon \
apache-commons-dbcp \
apache-commons-logging \
apache-commons-pool2 \
fillup \
java \
tomcat-lib"

inherit rpm
