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

RPM_NAME = "apache-commons-lang3-3.12.0-3.1.noarch.rpm"
RPM_HASH = "ddad6458cf86f29946ef803ddb3fc066a6b721f70896d37d87fd8df576afc6011bf226b42d2842aee25839b56a14ba62a88f9202bb5e57797811cc63fdfd10a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3 \
commons-lang3 \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-lang3-pom- \
osgi-org.apache.commons.lang3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
