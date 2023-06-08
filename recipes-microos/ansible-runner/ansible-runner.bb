SUMMARY = "Package for interfacing with Ansible"
DESCRIPTION = "Ansible Runner is a tool and python library that helps when interfacing with \
Ansible directly or as part of another system whether that be through a \
container image interface, as a standalone tool, or as a Python module that \
can be imported. The goal is to provide a stable and consistent interface \
abstraction to Ansible. This allows Ansible to be embedded into other \
systems that don’t want to manage the complexities of the interface on \
their own (such as CI/CD platforms, Jenkins, or other automated tooling)"
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "1.4.7"

RPM_NAME = "ansible-runner-1.4.7-2.4.noarch.rpm"
RPM_HASH = "616f4da47aa17dfe613ee25e49e5aeba4f8683d8b20c8efd134343c0ec3802e4eedbb74c5adedd1560525d5234b172c1136ea0290fd486d6678fb5edf5e0f05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-runner python3.10dist(ansible-runner) python3dist(ansible-runner)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-pexpect python3-psutil python3-python-daemon python3-six"

inherit rpm
