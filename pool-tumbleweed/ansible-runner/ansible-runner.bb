SUMMARY = "Run ansible-playbook inside an execution environment"
DESCRIPTION = "Consistent Ansible Python API and CLI with container and process isolation runtime capabilities"
LICENSE = "Apache-2.0"

PV = "2.3.4"

RPM_NAME = "ansible-runner-2.3.4-1.1.noarch.rpm"
RPM_HASH = "54d513c722eed1b7490ec4b3815440090ee139ea4ac2b1b3ba8d63ba008ee315e3c67a0fb1c4b659c0adc260a599214301b4374fc957c6260d7021b71ca624d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-runner \
python3.11dist-ansible-runner \
python3dist-ansible-runner"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-packaging \
python3-pexpect \
python3-python-daemon \
python3-setuptools \
python3-six"

inherit rpm
