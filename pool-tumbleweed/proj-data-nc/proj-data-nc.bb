SUMMARY = "New Caledonia datum grids for Proj"
DESCRIPTION = "New Caledonia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-nc-9.2.1-1.1.noarch.rpm"
RPM_HASH = "8d67a6dea5fea403c13a09137685744c7be691deafce1047711e757721b09259d66e3c2c8ef869c04a4bd32356ae90c71642e3b90754c56215b2e628d7317d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nc"

RDEPENDS:${PN} += ""

inherit rpm
