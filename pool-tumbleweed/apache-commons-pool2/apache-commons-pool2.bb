SUMMARY = "Apache Commons Pool 2.x series"
DESCRIPTION = "The goal of the Pool 2.x package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "apache-commons-pool2-2.4.2-5.16.noarch.rpm"
RPM_HASH = "2c1f313c646f8d1c747f1b0d1be3d9ffd6cd807f0d47450256e2ab3f10a3161f8dcea68fc670648cd465617ba0dbf9b797cf26e3a859b836d8af42cd2aeb1b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2 \
commons-pool2 \
mvn-org.apache.commons-commons-pool2 \
mvn-org.apache.commons-commons-pool2-pom-"

RDEPENDS:${PN} += "cglib \
java-headless \
javapackages-filesystem"

inherit rpm
