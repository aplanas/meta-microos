SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python310-moban-ansible-0.0.2-2.3.noarch.rpm"
RPM_HASH = "8a7c8c05f765a6a34b73ed81bdfb2e2715de2a980a2d4ffeb622e56d225d9586c24b85b3599fa9aa77548e69a601165eeb5257c6f6f7a09617b877b4803bc067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban-ansible \
python3.10dist-moban-ansible \
python310-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python310-moban"

inherit rpm
