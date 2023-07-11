SUMMARY = "Javadoc for bouncycastle"
DESCRIPTION = "API documentation for the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-javadoc-1.74-1.1.noarch.rpm"
RPM_HASH = "737700022b43870e963b55fdd7d4f915d8960fed3b8553b12141173b123907b905f9912cc6edd4453fb27e4baad307da9e6a023c96bab186bfa09db152ba5afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
