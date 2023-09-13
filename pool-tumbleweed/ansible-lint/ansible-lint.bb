SUMMARY = "Best practices checker for Ansible"
DESCRIPTION = "Checks playbooks for practices and behavior that could potentially be improved."
LICENSE = "MIT"

PV = "6.19.0"

RPM_NAME = "ansible-lint-6.19.0-1.1.noarch.rpm"
RPM_HASH = "fdfde366c53d788eb5475308493bc9ac1950666e24f67c03adbebfbc3c8a465fd40d5acff5a92961e8a0033ced40aa2a7e2500ad6405e1f06ef26270b441df3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-lint \
python3.11dist-ansible-lint \
python3dist-ansible-lint"

RDEPENDS:${PN} += "-python3-ruamel.yaml >= 0.17.31 and python3-ruamel.yaml < 0.18 \
/usr/bin/python3 \
ansible-core \
python-abi \
python3-PyYAML \
python3-ansible-compat \
python3-black \
python3-bracex \
python3-enrich \
python3-filelock \
python3-jsonschema \
python3-packaging \
python3-requests \
python3-rich \
python3-subprocess-tee \
python3-tenacity \
python3-wcmatch \
python3-yamllint"

inherit rpm
