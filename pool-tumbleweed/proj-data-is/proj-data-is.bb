SUMMARY = "Island datum grids for Proj"
DESCRIPTION = "Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-is-9.2.1-1.1.noarch.rpm"
RPM_HASH = "0e2386e09630d092d9c352373beb26c18ba88123f9741b9f761fc416c6219aae9243f1eb170a97481167806984c2c28f30f9f75ef852fb61f90675d83ec9f207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-is"

RDEPENDS:${PN} += ""

inherit rpm
