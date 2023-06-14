SUMMARY = "LDAP SDK"
DESCRIPTION = "The Mozilla LDAP SDKs enable you to write applications which access, \
manage, and update the information stored in an LDAP directory."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.0-or-later"

PV = "4.21.0"

RPM_NAME = "ldap-sdk-4.21.0-2.6.noarch.rpm"
RPM_HASH = "c65d7a4fcebbed8049380e90656ef37b1d4e4509913e4f163635049ecb8175b2c8a197fd4e3b83f4ddde1e3fbc4ad79869ce2a3465c9685f57a712f1326ade02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldap-sdk \
ldapjdk \
mvn-ldapjdk-ldapjdk \
mvn-ldapjdk-ldapjdk-pom- \
mvn-ldapsdk-ldapsdk \
mvn-ldapsdk-ldapsdk-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jpackage-utils \
mozilla-jss \
slf4j \
slf4j-jdk14"

inherit rpm
