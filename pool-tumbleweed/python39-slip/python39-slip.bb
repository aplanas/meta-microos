SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python39-slip-0.6.5-6.15.noarch.rpm"
RPM_HASH = "5cf24234a85904d06ab222ea2f3983e2597b3bb80ba25b9eeeec4714985137d2906aa07f5ce63e419f26c19963f3650d9bfde809b56bad883c6995219f9826a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(slip) \
python39-slip \
python3dist(slip)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
