SUMMARY = "United Kingdom datum grids for Proj"
DESCRIPTION = "United Kingdom datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-uk-9.2.0-1.3.noarch.rpm"
RPM_HASH = "583ddd8a9bfc4b316fdd602d2b2efc760bf74b52eaa9a6ef390a57ca0e95cfbe241d2e1f94fa1671bc8226eabfddce49c0b0d42c9583fdb20c6e5becd8176445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-uk"

RDEPENDS:${PN} += ""

inherit rpm
