SUMMARY = "Developer documentation for apache-commons-httpclient"
DESCRIPTION = "Developer documentation for apache-commons-httpclient in JavaDoc \
format. \
 \
Developer documentation for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-javadoc-3.1-13.12.noarch.rpm"
RPM_HASH = "d4f8e3f92818075fd8807c68689d6601ef90821aaa412be4fee6e8c1b9ffae95621862b0989eb962cebc7a45dfdf3d231224f759da3ee0c19f04a0df8feb949b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
