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

RPM_NAME = "unit-api-1.0-1.19.noarch.rpm"
RPM_HASH = "1d6e4cefbf519a11b8279b61bbdecb0cacd52ec6ea3215ec7ccd20c47a88a96e12606d625751f61ef3b023c7f6396646b45feaf70977b26026ab66207f907228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.measure-unit-api \
mvn-javax.measure-unit-api-pom- \
osgi-javax.measure.unit-api \
unit-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
