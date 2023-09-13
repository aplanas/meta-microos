SUMMARY = "JSR 363 - Units of Measurement API"
DESCRIPTION = "The Unit of Measurement library provides a set of \
Java language programming interfaces for handling \
units and quantities. The interfaces provide a layer \
which separates client code, which would call the \
API, from library code, which implements the API. \
 \
The specification contains Interfaces and abstract \
classes with methods for unit operations: \
 \
* Checking of unit compatibility \
* Expression of a quantity in various units \
* Arithmetic operations on units"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-1.0-2.1.noarch.rpm"
RPM_HASH = "2001bd77559c5f60241cb66b8e19e6d66471bc4a809518910243888d859535580cdf8ec5f01aadc87c8836d4973c5333707ec445801eb71cb1b6cef00dddbe4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.measure-unit-api \
mvn-javax.measure-unit-api-pom- \
osgi-javax.measure.unit-api \
unit-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
