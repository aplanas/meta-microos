SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-beniget-0.4.1-2.2.noarch.rpm"
RPM_HASH = "40beeb718dfe35fee52d750de03128c73ce5f0a94f178f51aaba761495cbcc53b240bd5b1fda615bf91bc59711e7f2f700bfb495eab7aac1ed08a20dbaa1fa86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-beniget \
python310-beniget \
python3dist-beniget"

RDEPENDS:${PN} += "python-abi \
python310-gast"

inherit rpm
