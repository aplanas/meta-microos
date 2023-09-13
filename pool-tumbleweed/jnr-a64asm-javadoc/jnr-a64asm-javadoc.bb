SUMMARY = "Javadocs for jnr-a64asm"
DESCRIPTION = "This package contains the API documentation for jnr-a64asm."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-javadoc-1.0.0-3.1.noarch.rpm"
RPM_HASH = "4b36be6ee1ece20cfc02d1c21d21b7d73fc2778d6c8720e7ea7e4609d5353d729dd9a30b1c2de6127d160f0174b6f8607cc0636caac8d9f7739be619bfe3d04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
