SUMMARY = "Javadoc for maven-plugin-testing"
DESCRIPTION = "API documentation for maven-plugin-testing."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-javadoc-3.3.0-5.13.noarch.rpm"
RPM_HASH = "b886d2a80c454328b069dbfe4832d35e215fce397ca84daa7628cda3a64f652a4a8f05fdfe925f9ad1bcb969cf381a84f70b05368e75c6e08f2c47ead8a4d616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
