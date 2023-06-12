SUMMARY = "Denmark datum grids for Proj"
DESCRIPTION = "Denmark datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-dk-9.2.0-1.3.noarch.rpm"
RPM_HASH = "67a6c2ac9a110d0b7947788c61614835e5ed6e289ef9ed9917e5da4be45c39bcb9fd19bb3a8ab3f9812c87cb9ecf07044e0ed252e9f6afaa7125c6143571288e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-dk"
RDEPENDS:${PN} += ""

inherit rpm
