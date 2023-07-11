SUMMARY = "Denmark datum grids for Proj"
DESCRIPTION = "Denmark datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-dk-9.2.1-1.1.noarch.rpm"
RPM_HASH = "87121a3947de21e2e242d403df3b9e0b29553d8078d53a71fe0635bced334209641b2bd6f06ab1c901889cb5bf5310aeb4c6b1543e92a6c5fc2e8ba10daa6916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-dk"

RDEPENDS:${PN} += ""

inherit rpm
