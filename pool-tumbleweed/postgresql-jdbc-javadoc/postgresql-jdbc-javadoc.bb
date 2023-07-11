SUMMARY = "API docs for postgresql-jdbc"
DESCRIPTION = "This package contains the API Documentation for postgresql-jdbc."
LICENSE = "BSD-2-Clause"

PV = "42.2.25"

RPM_NAME = "postgresql-jdbc-javadoc-42.2.25-4.4.noarch.rpm"
RPM_HASH = "26f4f3a0528456ee8c1b9abc2ea709e383de1af08c5a8a1eb7e46df0851725c17f6a3c92e7e883f60cb2cf325abbf8c126fbc46d360377b317c74d8b61eda2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
