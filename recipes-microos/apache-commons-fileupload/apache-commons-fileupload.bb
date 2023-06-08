SUMMARY = "API to work with HTML file upload"
DESCRIPTION = "The javax.servlet package lacks support for RFC-1867, HTML file \
upload.  This package provides a simple to use API for working with \
such data.  The scope of this package is to create a package of Java \
utility classes to read multipart/form-data within a \
javax.servlet.http.HttpServletRequest."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "apache-commons-fileupload-1.4-2.6.noarch.rpm"
RPM_HASH = "2c344903ae942fe57bc8dffb5703a9be8534d16ceb565031f228bbd0e9c4e8950f3a6bf636a494c2abca83dba19b31556840df925e8415bbca2ae559b7c0611d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload commons-fileupload jakarta-commons-fileupload mvn(commons-fileupload:commons-fileupload) mvn(commons-fileupload:commons-fileupload:pom:) mvn(org.apache.commons:commons-fileupload) mvn(org.apache.commons:commons-fileupload:pom:) osgi(org.apache.commons.fileupload)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io)"

inherit rpm
