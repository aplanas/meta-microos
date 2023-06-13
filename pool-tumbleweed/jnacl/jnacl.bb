SUMMARY = "eu.neilalexander:jnacl"
DESCRIPTION = "Pure Java implementation of the NaCl: Networking and Cryptography library \
Supports the following crypto primitives: curve25519xsalsa20poly1305"
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-1.0.0-1.7.noarch.rpm"
RPM_HASH = "247f7aaf8d9d50f6faaf08033ff77618a6f88b789477dfe13086d2e6a0d51fa07fba152dda1a38cee0b4bac3937d76a5bff807351de67fee73e96074ce44e8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl \
mvn(eu.neilalexander:jnacl) \
mvn(eu.neilalexander:jnacl:pom:) \
osgi(eu.neilalexander.jnacl)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
