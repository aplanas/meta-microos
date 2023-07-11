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

RPM_NAME = "apache-commons-lang3-3.12.0-2.7.noarch.rpm"
RPM_HASH = "e8a49a44c4027bac8c44e54d7456917dbc3d6473416840c4deb5722a7146ad206ee1556e74eb28eb87830ed515ddce48fd05eb086cfec11e050a0a9626ff80ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3 \
commons-lang3 \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-lang3-pom- \
osgi-org.apache.commons.lang3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
