SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 4.0/JSP 2.3/EL 3.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.8.0."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-9.0.75-1.2.noarch.rpm"
RPM_HASH = "57591c5b41a196e44cf0a3765c93793d2688ce3dd2f9383eb3c9729f8b755503ef2b32aa929171ef674cfa6bef0c4a56f941b7e3d8c2d19d170a1d04fe8d3ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat \
tomcat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
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
