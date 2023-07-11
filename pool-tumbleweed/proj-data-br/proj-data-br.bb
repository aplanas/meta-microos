SUMMARY = "Brasil datum grids for Proj"
DESCRIPTION = "Brasil datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-br-9.2.1-1.1.noarch.rpm"
RPM_HASH = "ba9a809fd2af5cb9902bdb2035ac6bb5a599991bc06767c1d99496acc4c906d3a76b4ab45a01c3dd10c32b466b15db3a58ba03172ff2f80ad78958851b0eddb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-br"

RDEPENDS:${PN} += ""

inherit rpm
