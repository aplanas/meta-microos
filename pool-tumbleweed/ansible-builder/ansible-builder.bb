SUMMARY = "An Ansible execution environment builder"
DESCRIPTION = "Ansible Builder is a tool that automates the process of \
building execution environments using the schemas and \
tooling defined in various Ansible Collections and by \
the user. \
 \
See the readthedocs page for ansible-builder at: \
https://ansible-builder.readthedocs.io/en/latest/"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "ansible-builder-3.0.0-1.1.noarch.rpm"
RPM_HASH = "162354abbe22884601126e68faebc3cb941a6f977f3639822e99c183c41df07dd65356d98e4b973c6b316d5b4fa20abf65861f2678eb9b495403ebf20a16cf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-builder \
python3.10dist(ansible-builder) \
python3dist(ansible-builder)"
RDEPENDS:${PN} += "(podman or docker) \
/bin/bash \
/usr/bin/bash \
/usr/bin/python3.10 \
python(abi) \
python3-PyYAML \
python3-bindep \
python3-jsonschema \
python3-requirements-parser"

inherit rpm
