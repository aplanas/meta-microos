SUMMARY = "Javadocs for jnr-constants"
DESCRIPTION = "This package contains the API documentation for jnr-constants."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-javadoc-0.10.4-1.2.noarch.rpm"
RPM_HASH = "2d5874093dce35de589745bfb8879d6b240bfd21620cac743bcdbdad31ef230b6ed103542ca1fdac32089f9d82a3fee5fe55fd6cd9dd5096e846d363c7ad4452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
