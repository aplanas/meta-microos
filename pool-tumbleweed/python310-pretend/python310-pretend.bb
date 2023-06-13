SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python310-pretend-1.0.9-3.1.noarch.rpm"
RPM_HASH = "adeb3a7d86533d0c4d7b694cbf77519a00f3b826f30337faaaf272e1d62394741d8ef55cb4f4b25c3853f7c2f4ca5cfb6e53f90530d025bdae822b28f019d83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pretend \
python3.10dist(pretend) \
python310-pretend \
python3dist(pretend)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
