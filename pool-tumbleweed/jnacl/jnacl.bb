SUMMARY = "eu.neilalexander:jnacl"
DESCRIPTION = "Pure Java implementation of the NaCl: Networking and Cryptography library \
Supports the following crypto primitives: curve25519xsalsa20poly1305"
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-1.0.0-2.1.noarch.rpm"
RPM_HASH = "d893635aaf0569e9fa11045fd458fe363fce3bb92c0c7139104e6e0a48e5334d5fecf45c3a40cd44e4c20faba512e8a3572933f4fc0efccba90de18de551836e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl \
mvn-eu.neilalexander-jnacl \
mvn-eu.neilalexander-jnacl-pom- \
osgi-eu.neilalexander.jnacl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
