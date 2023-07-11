SUMMARY = "Belgium datum grids for Proj"
DESCRIPTION = "Belgium datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-be-9.2.1-1.1.noarch.rpm"
RPM_HASH = "c2c8a27d8dda59346a670255dc4ab560271c7ace1e83a3f10afc2f14dff029fbdc6961c7215b1357ba2e7c304cbde80a53bd81b95032f3656e2c7ed73ae1f567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-be"

RDEPENDS:${PN} += ""

inherit rpm
