SUMMARY = "Javadoc for maven-file-management"
DESCRIPTION = "API documentation for maven-file-management."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-javadoc-3.0.0-3.8.noarch.rpm"
RPM_HASH = "6c6dc2b2a033122f9688149fc5cacce9236e47e1187b1936417e7fd3a38685620dd2ec2445099e352a9e7c1a6ae85d6003544f02479c4da33b058fcc613b0602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
