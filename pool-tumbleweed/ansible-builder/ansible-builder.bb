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

RPM_NAME = "ansible-builder-3.0.0-1.2.noarch.rpm"
RPM_HASH = "88be39519e8f0f5019cd471387aa150a186ce6288c2147b31a35384a7885b577d07e25fdb86d91fd5eea15e1e57cadb0ae1eeefb3861e67db74783b495832cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-builder \
python3.11dist-ansible-builder \
python3dist-ansible-builder"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
python-abi \
python3-PyYAML \
python3-bindep \
python3-jsonschema \
python3-requirements-parser"

inherit rpm
