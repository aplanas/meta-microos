SUMMARY = "BPF Compiler Collection documentation"
DESCRIPTION = "Documentation on how to write programs with the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-docs-0.26.0-2.10.noarch.rpm"
RPM_HASH = "86ed5319922bb30c29fc9f80f6d95df939f8e4cfbc11cdfb733e6eb5c93ec2e0b84abadc4e48e14580fbcebae1a527d0035c3b307718e1025046762d463ebe2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcc-docs"
RDEPENDS:${PN} += ""

inherit rpm
