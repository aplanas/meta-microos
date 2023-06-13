SUMMARY = "Developer documentation for apache-commons-httpclient"
DESCRIPTION = "Developer documentation for apache-commons-httpclient in JavaDoc \
format. \
 \
Developer documentation for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-javadoc-3.1-13.11.noarch.rpm"
RPM_HASH = "b991284f74b8576f9edd271598d79fa3722b1ab137ca361dc54a6ff9ce393f635e8970350fd56a9e3dee719d16bf1c032f987ffd2f82b4cd1d9c774a7af0a5be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
