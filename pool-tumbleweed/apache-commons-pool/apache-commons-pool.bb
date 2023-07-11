SUMMARY = "Apache Commons Pool"
DESCRIPTION = "The goal of the Pool package is to create and maintain an object \
(instance) pooling package to be distributed under the ASF license. The \
package supports a variety of pool implementations, but encourages \
support of an interface that makes these implementations \
interchangeable."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-1.6-5.16.noarch.rpm"
RPM_HASH = "4a98fd38748da0373090bf7ed688fc20ab728c577efa3eca20bf46ea54acdc62696a19600e7e82c145dad14703eb45fff4b633bfb94354ad6abf9f41480866d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool \
commons-pool \
jakarta-commons-pool \
mvn-commons-pool-commons-pool \
mvn-commons-pool-commons-pool-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
