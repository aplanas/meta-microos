SUMMARY = "Austria datum grids for Proj"
DESCRIPTION = "Austria datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-at-9.2.0-1.3.noarch.rpm"
RPM_HASH = "dd424d859d3462e5b15e1baa73811c9eb761f4c21168a9272e9630cc00d18235e0f4e72c0db5048e3405ac4e9773ec004beb3b5844b58065d8e2e408b4ad394c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-at"

RDEPENDS:${PN} += ""

inherit rpm
