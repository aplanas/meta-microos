SUMMARY = "Germany datum grids for Proj"
DESCRIPTION = "Germany datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-de-9.2.0-1.3.noarch.rpm"
RPM_HASH = "6c1370929fe1f1f3617bc80cc0dfa0f8eaed19c0eaf695b2cc9b438fcc14b14f334f7966c1c84d46cd59bb11e4710e60e8be44e6bdf1d7906626e8d4adcbe730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-de"
RDEPENDS:${PN} += ""

inherit rpm
