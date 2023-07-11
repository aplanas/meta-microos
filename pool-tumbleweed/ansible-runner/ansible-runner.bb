SUMMARY = "Run ansible-playbook inside an execution environment"
DESCRIPTION = "Consistent Ansible Python API and CLI with container and process isolation runtime capabilities"
LICENSE = "Apache-2.0"

PV = "2.3.3"

RPM_NAME = "ansible-runner-2.3.3-1.2.noarch.rpm"
RPM_HASH = "c7233bf21d4cf6444173dd3ff25448da49760a1d8396968a97f1ca919893ac1af591539f83db15e96583aab5fa20a8edf1974223baf6eddef89af4e337418db1"
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
