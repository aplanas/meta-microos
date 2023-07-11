SUMMARY = "Implementation of EdDSA (Ed25519) in Java"
DESCRIPTION = "This is an implementation of EdDSA in Java. Structurally, it \
is based on the ref10 implementation in SUPERCOP (see \
http://ed25519.cr.yp.to/software.html). \
 \
There are two internal implementations: \
 \
* A port of the radix-2^51 operations in ref10 \
  - fast and constant-time, but only useful for Ed25519. \
* A generic version using BigIntegers for calculation \
  - a bit slower and not constant-time, but compatible \
    with any EdDSA parameter specification."
LICENSE = "CC0-1.0"

PV = "0.3.0"

RPM_NAME = "ed25519-java-0.3.0-2.11.noarch.rpm"
RPM_HASH = "64004791c5d22c455e9a29fab14a802f188cd02f3cd6d16bdb0ffe5b0bd73416d885fdb2284a6fd385ee2c52767377a3aa2e68793aa489c08a795b14d9458b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java \
mvn-net.i2p.crypto-eddsa \
mvn-net.i2p.crypto-eddsa-pom- \
osgi-net.i2p.crypto.eddsa"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
