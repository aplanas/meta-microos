SUMMARY = "Apache Commons Pool 2.x series"
DESCRIPTION = "The goal of the Pool 2.x package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "apache-commons-pool2-2.4.2-5.15.noarch.rpm"
RPM_HASH = "cc56494e25ab068bcbcdaeb9177c583af450c2b47c6aa5800198b523f8709baf22fe917615ef91fe85b06d8a0d520c74db829bb631020d20c713675817a10573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool2 \
commons-pool2 \
mvn-org.apache.commons-commons-pool2 \
mvn-org.apache.commons-commons-pool2-pom-"

RDEPENDS:${PN} += "cglib \
java-headless \
javapackages-filesystem"

inherit rpm
