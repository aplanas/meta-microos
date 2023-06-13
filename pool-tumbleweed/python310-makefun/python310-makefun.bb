SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python310-makefun-1.15.1-2.2.noarch.rpm"
RPM_HASH = "cf1671b5a973a96b4d97c81b280ce677cae5d997548a625cd052b590636f486e366962147021496e90454639881ccf06bd1293b8f671b4190d4a201a355cf4bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-makefun \
python3.10dist(makefun) \
python310-makefun \
python3dist(makefun)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
