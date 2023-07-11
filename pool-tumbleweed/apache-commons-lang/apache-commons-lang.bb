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

RPM_NAME = "apache-commons-lang-2.6-15.12.noarch.rpm"
RPM_HASH = "a164740dda2678aa1d765bc30dec267e274437db28a42c41e2c8a497f0a8a9ae80b2481c63bc18fbb574cf1a1c6e04aabdb544e035169189b3a79818ed762e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang \
commons-lang \
jakarta-commons-lang \
mvn-commons-lang-commons-lang \
mvn-commons-lang-commons-lang-pom- \
osgi-org.apache.commons.lang"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
