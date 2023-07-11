SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python39-moban-ansible-0.0.2-2.4.noarch.rpm"
RPM_HASH = "7eabca622d93d5bcfb489e06b096881b8eecc87c66a018f5cd1eb378b85fee2aefc124a96a5fe34655fcefb28afd8b462be1b8871aad835dd367685106192f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moban-ansible \
python39-moban-ansible \
python3dist-moban-ansible"

RDEPENDS:${PN} += "python-abi \
python39-moban"

inherit rpm
