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

RPM_NAME = "unit-api-1.0-1.18.noarch.rpm"
RPM_HASH = "530e08571c75a565ea3dd588ee974f77e06ffc28652bb098bfeab82dc4121d4b7bd5ce2f38386c0e828f8a442e439c783addcbd025b58b01af5faef6e63101e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.measure-unit-api \
mvn-javax.measure-unit-api-pom- \
osgi-javax.measure.unit-api \
unit-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
