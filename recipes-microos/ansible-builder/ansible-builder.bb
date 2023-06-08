SUMMARY = "An Ansible execution environment builder"
DESCRIPTION = "Ansible Builder is a tool that automates the process of \
building execution environments using the schemas and \
tooling defined in various Ansible Collections and by \
the user. \
 \
See the readthedocs page for ansible-builder at: \
https://ansible-builder.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "ansible-builder-1.2.0-1.1.noarch.rpm"
RPM_HASH = "b237c1a1b221d35959ad5d1eb7b7e32310acc8cba97b6874bf20f92c79ccfd4228ab6d02b548a73dbed4e997c766659426db6df56f30593c884054442ba6324e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-builder python3.10dist(ansible-builder) python3dist(ansible-builder)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-bindep python3-requirements-parser"

inherit rpm
