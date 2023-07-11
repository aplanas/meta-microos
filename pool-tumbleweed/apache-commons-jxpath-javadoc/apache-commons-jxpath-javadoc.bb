SUMMARY = "API documentation for apache-commons-jxpath"
DESCRIPTION = "This package contains the API documentation for apache-commons-jxpath."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-javadoc-1.3-9.16.noarch.rpm"
RPM_HASH = "126d215e15b7960fdb93f867a53bffbd34df2e854ea2025480fad108bfbb3f2e10c51afaa726c68521e58c05c2afff33b12881c77ef6e9a463033e97ec8e0849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
