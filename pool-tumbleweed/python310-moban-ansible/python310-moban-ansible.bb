SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python310-moban-ansible-0.0.2-2.4.noarch.rpm"
RPM_HASH = "ded4e304900b7f0e940149b988d302e91c8c8d7c45dd4783a8f70f5876c096539fe3edfa25f67de37da87002536e93da489e636791e8b3ef75fb511521dc12dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-moban-ansible \
python310-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python310-moban"

inherit rpm
