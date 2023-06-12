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

PV = "2.6"

RPM_NAME = "apache-commons-lang-2.6-15.11.noarch.rpm"
RPM_HASH = "df896c23f6660c4bcbdf0773b3947c790f558c745f07d63f4af4c3e51cb4457542ba19c00a639eef4cd0da6a827606954ce6f8f411f7b34d0f0a36993b4701c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang \
commons-lang \
jakarta-commons-lang \
mvn(commons-lang:commons-lang) \
mvn(commons-lang:commons-lang:pom:) \
osgi(org.apache.commons.lang)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
