SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python39-moban-ansible-0.0.2-2.3.noarch.rpm"
RPM_HASH = "1d9461277871b282c9c940b37a52aea8e4fd9e6d223ed8dd62d1821249c7269757e24f828bb2fcb29969c7201b2a6ca5a6ef18d327d35f9552ae576581866115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moban-ansible \
python39-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python39-moban"

inherit rpm
