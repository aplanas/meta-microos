SUMMARY = "eu.neilalexander:jnacl"
DESCRIPTION = "Pure Java implementation of the NaCl: Networking and Cryptography library \
Supports the following crypto primitives: curve25519xsalsa20poly1305"
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-1.0.0-1.8.noarch.rpm"
RPM_HASH = "3fd32ff8f69bfafe1dbcfdad7da375d2cf0d43f54f08f430951d5de7f6cad9759fc1915d5edb1cd5763fcc44ea94728302aabf3b2ad765381a75231be685bcf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl \
mvn-eu.neilalexander-jnacl \
mvn-eu.neilalexander-jnacl-pom- \
osgi-eu.neilalexander.jnacl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
