SUMMARY = "Aids in the development and testing of Ansible roles"
DESCRIPTION = "Molecule project is designed to aid in the development and testing of \
Ansible roles. \
 \
Molecule provides support for testing with multiple instances, operating \
systems and distributions, virtualization providers, test frameworks and \
testing scenarios."
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "molecule-5.0.1-2.1.noarch.rpm"
RPM_HASH = "88fd6dec37fc18d56fb7a4d6302b931526399251e1b1d69b2767ecd1ddca4d490c9aa76f9ca9933ce4b8a0c832fbfb10b39f2c64c2ccd9b533556aa7d3cb831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molecule \
python3.10dist(molecule) \
python3dist(molecule)"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ansible-core \
python(abi) \
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
