SUMMARY = "Salted Challenge Response Authentication Mechanism - Java Implementation"
DESCRIPTION = "This is a Java implementation of SCRAM (Salted Challenge Response \
Authentication Mechanism) which is part of the family of Simple \
Authentication and Security Layer (SASL, RFC 4422) authentication \
mechanisms. It is described as part of RFC 5802 and RFC7677."
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-2.1-2.10.noarch.rpm"
RPM_HASH = "1d33565a7bd690f9d7f29056745e141fd39c1581d6434cccb98780965532bf0c9784bbbe3385f6f185516eca7f4d0f127003b26b8b2cc01d3882e600051df82b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.scram:common) \
mvn(com.ongres.scram:common:pom:) \
ongres-scram"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.ongres.stringprep:saslprep)"

inherit rpm
