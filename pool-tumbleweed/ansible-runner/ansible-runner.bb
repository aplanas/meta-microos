SUMMARY = "Run ansible-playbook inside an execution environment"
DESCRIPTION = "Consistent Ansible Python API and CLI with container and process isolation runtime capabilities"
LICENSE = "Apache-2.0"

PV = "2.3.3"

RPM_NAME = "ansible-runner-2.3.3-1.1.noarch.rpm"
RPM_HASH = "5907bcec71843931fdd08c57f60822a01d645f8bb634ac579bf809a2faefc1c0c0c83cbecbe635784c07daf71fda87e820fd42ce2933d25d37c5f1f7ad35a68a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-runner \
python3.10dist(ansible-runner) \
python3dist(ansible-runner)"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-packaging \
python3-pexpect \
python3-python-daemon \
python3-setuptools \
python3-six"

inherit rpm
