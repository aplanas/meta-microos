SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-beniget-0.4.1-2.1.noarch.rpm"
RPM_HASH = "47e3f43c8f59f056f5d96f2e6a941cc6251659cabfba567e7e391d93aa71be48d29ae02e11b5e3655063d2918a71d876f03f96b5480c2675fa861644c454240a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beniget \
python3.10dist(beniget) \
python310-beniget \
python3dist(beniget)"

RDEPENDS:${PN} += "python(abi) \
python310-gast"

inherit rpm
