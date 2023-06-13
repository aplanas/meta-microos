SUMMARY = "Spain datum grids for Proj"
DESCRIPTION = "Spain datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-es-9.2.0-1.3.noarch.rpm"
RPM_HASH = "36e5a63b158742a58b04f9d56948f00279d0c39350ae6ea664134d9f9e87dba3e281f0555247bd67bca501a2674f0267cf7b66f26721fb77a73ba6c07479f79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-es"

RDEPENDS:${PN} += ""

inherit rpm
