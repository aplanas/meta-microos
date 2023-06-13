SUMMARY = "Jakarta Activation Specification and Implementation"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "jakarta-activation-2.1.0-2.6.noarch.rpm"
RPM_HASH = "b535dbd7515a9dfd49d6893c2c6e3bf2c06528dc9a77050e240850ed47ff4742e4e54308c335d2d8664f94d36b777d8d1c8e15a9ae1f9d45c0afc111bb8106b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation \
mvn(jakarta.activation:jakarta.activation-api) \
mvn(jakarta.activation:jakarta.activation-api:pom:) \
osgi(jakarta.activation-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
