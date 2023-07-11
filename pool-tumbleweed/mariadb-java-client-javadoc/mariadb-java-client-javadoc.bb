SUMMARY = "Javadoc for mariadb-java-client"
DESCRIPTION = "This package contains the API documentation for mariadb-java-client."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-javadoc-2.4.3-1.19.noarch.rpm"
RPM_HASH = "f1ab1b51708a842f6fb2ebac0f3746c2df5a40349de5514d1075214108912564d882df48e03c0117f4c5b5ac48bd869209c1bec7c4d85f73bc4dcb3a68d10999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-java-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
