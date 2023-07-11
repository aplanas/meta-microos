SUMMARY = "Slovakia datum grids for Proj"
DESCRIPTION = "Slovakia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-sk-9.2.1-1.1.noarch.rpm"
RPM_HASH = "2146637dbd78b12a021a3b21a506f749af418f24c038e34008f39966949fdd4892094e7592819d48ea29fcdcf89f0711f721927439a7d4a1dfa536df2f81d999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-sk"

RDEPENDS:${PN} += ""

inherit rpm
