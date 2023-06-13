SUMMARY = "API documentation for apache-commons-el"
DESCRIPTION = "API documentation for apache-commons-el."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-javadoc-1.0-3.6.noarch.rpm"
RPM_HASH = "1ad0196ccaf9b03f6baeafea9b26310f819b5c52523ee03c54071285e6faee27033df3574639c3536475350bf2871082d5140e0ea7e2abfbc442230a912c3f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
