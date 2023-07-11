SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-beniget-0.4.1-2.2.noarch.rpm"
RPM_HASH = "93d0897aa03576e4a7ece4700f21c3806e36319892409c3040f31fedb1335f1e27dc9cd2361c6f0a06d3b32624970f9c32ea810abb3e473617080c977931315c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beniget \
python3.11dist-beniget \
python311-beniget \
python3dist-beniget"

RDEPENDS:${PN} += "python-abi \
python311-gast"

inherit rpm
