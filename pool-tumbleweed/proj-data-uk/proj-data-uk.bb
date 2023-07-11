SUMMARY = "United Kingdom datum grids for Proj"
DESCRIPTION = "United Kingdom datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-uk-9.2.1-1.1.noarch.rpm"
RPM_HASH = "cbcbfbe4155e618098c3f74a80ef9d261ef6de827551fd1740852c8cdd041abe6dba632e4f12acf8bc192ecee986faf89f31f6c220da3eb086c4072722197f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-uk"

RDEPENDS:${PN} += ""

inherit rpm
