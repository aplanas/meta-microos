SUMMARY = "Switzerland datum grids for Proj"
DESCRIPTION = "Switzerland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-ch-9.2.0-1.3.noarch.rpm"
RPM_HASH = "8fd0f966e47a81f7e9db3a7d92e1001e55c87ec9313e1a967acc838668481857b740e321505026c35fc4446d72feda3a1a762c0e0bcc49ce98c662d07adae55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ch"
RDEPENDS:${PN} += ""

inherit rpm
