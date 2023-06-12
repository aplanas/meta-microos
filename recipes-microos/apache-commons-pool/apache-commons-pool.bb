SUMMARY = "Apache Commons Pool"
DESCRIPTION = "The goal of the Pool package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-1.6-5.15.noarch.rpm"
RPM_HASH = "b0a92617275947ccff5de96638f2764389b5ee3b0bbb569814c59172f7ad24360f0711204c9e90cc5c0a07478ae6144110be31c705b74ef211c496ffcc7a9d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool \
commons-pool \
jakarta-commons-pool \
mvn(commons-pool:commons-pool) \
mvn(commons-pool:commons-pool:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
