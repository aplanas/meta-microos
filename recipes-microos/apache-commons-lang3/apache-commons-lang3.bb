SUMMARY = "Apache Commons Lang Package"
DESCRIPTION = "The standard Java libraries fail to provide enough methods for \
manipulation of its core classes. The Commons Lang Component provides \
these extra methods. \
 \
The Commons Lang Component provides a host of helper utilities for the \
java.lang API, notably String manipulation methods, basic numerical \
methods, object reflection, creation and serialization, and System \
properties. Additionally it contains an inheritable enum type, an \
exception structure that supports multiple types of nested-Exceptions \
and a series of utilities dedicated to help with building methods, such \
as hashCode, toString and equals."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "apache-commons-lang3-3.12.0-2.6.noarch.rpm"
RPM_HASH = "f6f9c1273377a5e3cfbf39ee6fdf0b8164fa06a4ae8a3a73d0dcb58e44e066601b406f3a33940895fe747fb5a2d9c6b30f7c7e5c489013b0de8b466a5513879f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3 commons-lang3 mvn(org.apache.commons:commons-lang3) mvn(org.apache.commons:commons-lang3:pom:) osgi(org.apache.commons.lang3)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
