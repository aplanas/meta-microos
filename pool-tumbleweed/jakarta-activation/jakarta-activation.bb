SUMMARY = "Jakarta Activation Specification and Implementation"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "jakarta-activation-2.1.0-2.7.noarch.rpm"
RPM_HASH = "253c60e132a554e0ee0ab422fa4d67e45a7d78c44e339a79492069b6bc8b65c4e3bcf5ec3fcc192f9f4ae15b6dbacdf6f59f6072e2372cca7124d9a97fc0aca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation \
mvn-jakarta.activation-jakarta.activation-api \
mvn-jakarta.activation-jakarta.activation-api-pom- \
osgi-jakarta.activation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
