SUMMARY = "Canada datum grids for Proj"
DESCRIPTION = "Canada datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-ca-9.2.1-1.1.noarch.rpm"
RPM_HASH = "99b17819fed621713113ea58bfb042e65603ac82341250e2794733d685ec075ee20652546a5888aad785920d337727815d32f0ee98e186056544eeba0798ea4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ca"

RDEPENDS:${PN} += ""

inherit rpm
