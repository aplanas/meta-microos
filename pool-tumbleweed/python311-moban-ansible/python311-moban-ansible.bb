SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python311-moban-ansible-0.0.2-2.4.noarch.rpm"
RPM_HASH = "ad763eae1fb3f06f9b78d8e0d81be9e57872fd1ce5cda727167b26cb5ce72e13261ec02e0f7ebd693ed7e9387c5149cf9c10f35ffb897590fdd8013734468b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moban-ansible \
python3.11dist-moban-ansible \
python311-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python311-moban"

inherit rpm
