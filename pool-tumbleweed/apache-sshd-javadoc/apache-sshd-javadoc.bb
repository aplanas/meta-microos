SUMMARY = "API documentation for apache-sshd"
DESCRIPTION = "This package provides apache-sshd."
LICENSE = "Apache-2.0 & ISC"

PV = "2.9.2"

RPM_NAME = "apache-sshd-javadoc-2.9.2-2.3.noarch.rpm"
RPM_HASH = "fcca4cdd6919cdb68277bbac8cb450a0ec53cb2abe2a41ed4052a28a79d42cece1855a1593b7a43ae038756eda4f864d6a41827ad11eb4ccb92ec6975905940d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
