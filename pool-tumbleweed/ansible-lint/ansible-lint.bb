SUMMARY = "Best practices checker for Ansible"
DESCRIPTION = "Checks playbooks for practices and behavior that could potentially be improved."
LICENSE = "MIT"

PV = "6.17.0"

RPM_NAME = "ansible-lint-6.17.0-1.1.noarch.rpm"
RPM_HASH = "717ac6e8fc7d31b60e57d8445fa3886b2e7f111ba0f009c9cc438af821a9adf1d2d54a00bd51b8de3105a753650c9094200c18f973545dea60eea6e92c75a7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-lint \
python3.10dist(ansible-lint) \
python3dist(ansible-lint)"

RDEPENDS:${PN} += "(python3-ruamel.yaml >= 0.17.31 and python3-ruamel.yaml < 0.18) \
/usr/bin/python3 \
ansible-core \
python(abi) \
python3-PyYAML \
python3-ansible-compat \
python3-black \
python3-bracex \
python3-enrich \
python3-filelock \
python3-jsonschema \
python3-packaging \
python3-rich \
python3-subprocess-tee \
python3-tenacity \
python3-wcmatch \
python3-yamllint"

inherit rpm
