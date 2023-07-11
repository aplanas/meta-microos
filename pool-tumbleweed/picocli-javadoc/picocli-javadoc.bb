SUMMARY = "Javadoc for picocli"
DESCRIPTION = "This package contains the API documentation for picocli."
LICENSE = "Apache-2.0"

PV = "4.7.4"

RPM_NAME = "picocli-javadoc-4.7.4-2.1.noarch.rpm"
RPM_HASH = "2215a3de2f15fc5590f717f7d6fed7335ae425904d7c07971e1de1592146a573e74709abba2bdfcdc606d874a68650a5b694baaa33c4a97ca4320dbcdd106721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
