SUMMARY = "Javadocs for jnr-a64asm"
DESCRIPTION = "This package contains the API documentation for jnr-a64asm."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-javadoc-1.0.0-2.1.noarch.rpm"
RPM_HASH = "0510d9741afe9680e09f28369358ba62cfab5e811d3eb79c040604217e714679bddfba085fa1ff81d2738211d3acd88a5489e1b9efce224054f08f41ea5b7394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
