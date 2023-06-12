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

RPM_NAME = "ed25519-java-0.3.0-2.10.noarch.rpm"
RPM_HASH = "6a5ca4177d38b22b2d673105a5ddbaead49864224c92b43f8cff0edffa8aded4d04299ff5ceb9fffddfc27eed67cea3184c8075e5700ac1fb335284f0ed16fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ed25519-java \
mvn(net.i2p.crypto:eddsa) \
mvn(net.i2p.crypto:eddsa:pom:) \
osgi(net.i2p.crypto.eddsa)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
