SUMMARY = "Javadoc for mariadb-java-client"
DESCRIPTION = "This package contains the API documentation for mariadb-java-client."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-javadoc-2.4.3-2.1.noarch.rpm"
RPM_HASH = "529ca4c3c44dd8f5ea10d69501140184e0215365eee1c7f6b477967c498f76a67cd5e56e861278365cdc1df7ce737611894aed6ad8702c152ad885306fe6c749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-java-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
