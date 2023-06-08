SUMMARY = "API documentation for apache-commons-jxpath"
DESCRIPTION = "This package contains the API documentation for apache-commons-jxpath."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-javadoc-1.3-9.15.noarch.rpm"
RPM_HASH = "8f400d2eee39e44c4255534f1a378ef0c7230141e30f7e4e32ef11af09a889f416590e321c5b70e352dcba324738472103dfadff61d8191c523f3710fc82890b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
