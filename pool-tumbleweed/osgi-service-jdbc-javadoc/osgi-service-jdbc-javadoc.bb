SUMMARY = "API documentation for osgi-service-jdbc"
DESCRIPTION = "This package provides API documentation for osgi-service-jdbc."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-javadoc-1.0.0-1.1.noarch.rpm"
RPM_HASH = "481616d94c6dc6d322e55b08ddaa7fed19146aa4bfe9877eaa1f483be7f1a8e53dc8e7fd19d627d1577cccd003cdd7d6d564a86f72a0d9e3661092e042487e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
