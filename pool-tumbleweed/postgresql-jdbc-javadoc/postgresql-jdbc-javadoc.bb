SUMMARY = "API docs for postgresql-jdbc"
DESCRIPTION = "This package contains the API Documentation for postgresql-jdbc."
LICENSE = "BSD-2-Clause"

PV = "42.2.25"

RPM_NAME = "postgresql-jdbc-javadoc-42.2.25-4.3.noarch.rpm"
RPM_HASH = "eed7347e6b01adbc261fe9d339e24fe9d5acf1abc441d067a86d52017ec2ac3f4a5fc3b7b326bcd3e9350e4949619a076440d1bc5912af7304377d4f810a5976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-jdbc-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
