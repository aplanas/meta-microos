SUMMARY = "Javadoc for jboss-logging"
DESCRIPTION = "This package contains the API documentation for jboss-logging."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-javadoc-3.4.1-3.10.noarch.rpm"
RPM_HASH = "39323bfc8a9a90c759119941d01b7a973974300f7db318187a087313657a89333d1f37243c423d18b53d121ca35fbb2e09c56d538648c00e05b936acb2bd5b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
