SUMMARY = "Javadoc for maven-plugin-testing"
DESCRIPTION = "API documentation for maven-plugin-testing."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-javadoc-3.3.0-5.12.noarch.rpm"
RPM_HASH = "77c777b0a9fdacc452f0493618eed672c1a82f9646af3e48684b0a460e61da245bf6be07495dacf1579903f4101dd9cafd7c56ada4d4e8023c5068b62792ba29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
