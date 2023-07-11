SUMMARY = "Salted Challenge Response Authentication Mechanism - Java Implementation"
DESCRIPTION = "This is a Java implementation of SCRAM (Salted Challenge Response \
Authentication Mechanism) which is part of the family of Simple \
Authentication and Security Layer (SASL, RFC 4422) authentication \
mechanisms. It is described as part of RFC 5802 and RFC7677."
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-2.1-2.11.noarch.rpm"
RPM_HASH = "139c52bce6312a45cd09ccb8f846ede9e371bec673d5abeae73b3b82bda5147bea362ceca1a0c4d12e4199cb593faf2ba30ef0db23939084353005604d7ab97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.scram-common \
mvn-com.ongres.scram-common-pom- \
ongres-scram"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.stringprep-saslprep"

inherit rpm
