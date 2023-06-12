SUMMARY = "API to work with HTML file upload"
DESCRIPTION = "The javax.servlet package lacks support for RFC-1867, HTML file \
upload.  This package provides a simple to use API for working with \
such data.  The scope of this package is to create a package of Java \
utility classes to read multipart/form-data within a \
javax.servlet.http.HttpServletRequest."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-fileupload-1.5-1.1.noarch.rpm"
RPM_HASH = "d27bf0c544a775bbb60cfb1d3212eb727249a998714eab297ad2917c8b7901d8d428486475191739a2b2fa03a6244ee21911b4de6ee94beedfde346b8b5eda0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload \
commons-fileupload \
jakarta-commons-fileupload \
mvn(commons-fileupload:commons-fileupload) \
mvn(commons-fileupload:commons-fileupload:pom:) \
mvn(org.apache.commons:commons-fileupload) \
mvn(org.apache.commons:commons-fileupload:pom:) \
osgi(org.apache.commons.fileupload)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io)"

inherit rpm
