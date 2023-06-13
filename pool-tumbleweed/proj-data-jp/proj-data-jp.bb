SUMMARY = "Japan datum grids for Proj"
DESCRIPTION = "Japan datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-jp-9.2.0-1.3.noarch.rpm"
RPM_HASH = "9a2da12524e3fafcbeb385707f84814f8d6b02641e742b14b03b203549cee66bfe764209a19c620085d79e04eafad6b57eebecd0ae0ba568ceb00fd7716e8a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-jp"

RDEPENDS:${PN} += ""

inherit rpm
