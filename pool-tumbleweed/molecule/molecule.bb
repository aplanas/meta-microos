SUMMARY = "Aids in the development and testing of Ansible roles"
DESCRIPTION = "Molecule project is designed to aid in the development and testing of \
Ansible roles. \
 \
Molecule provides support for testing with multiple instances, operating \
systems and distributions, virtualization providers, test frameworks and \
testing scenarios."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "molecule-5.1.0-1.1.noarch.rpm"
RPM_HASH = "2866f9eb69c7228f2300e84f175ca7476981da6592c9af3fd47ebe1d9229081a831b095fec2f2c3d77ba479239eee2fa6e188367d27ff6fe8abe2ae56423fb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molecule \
python3.11dist-molecule \
python3dist-molecule"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ansible-core \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-ansible-compat \
python3-base \
python3-click \
python3-click-help-colors \
python3-cookiecutter \
python3-enrich \
python3-jsonschema \
python3-packaging \
python3-pluggy \
python3-rich"

inherit rpm
