SUMMARY = "Javadoc for felix-gogo-command"
DESCRIPTION = "This package contains API documentation for felix-gogo-command."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-javadoc-1.1.2-2.1.noarch.rpm"
RPM_HASH = "83befe4de0750819c72a4cb996cfb4456023dd0ab63a4169b993e32be94cbd97ba839feac1691a9f62c875544892badc1a8ee176f7758088b810a039ad084f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
