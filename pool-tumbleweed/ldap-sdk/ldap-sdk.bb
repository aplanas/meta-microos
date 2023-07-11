SUMMARY = "LDAP SDK"
DESCRIPTION = "The Mozilla LDAP SDKs enable you to write applications which access, \
manage, and update the information stored in an LDAP directory."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.0-or-later"

PV = "4.21.0"

RPM_NAME = "ldap-sdk-4.21.0-2.7.noarch.rpm"
RPM_HASH = "431642a402bd06e0f4ab0f661aa37cde7e0bf119855145807a3d82e130fb67a83f70d835ed04b6b8f17caef9725deee2d1f8175986155996f73795e9ce9412fb"
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
