SUMMARY = "Best practices checker for Ansible"
DESCRIPTION = "Checks playbooks for practices and behavior that could potentially be improved."
LICENSE = "MIT"

PV = "6.17.2"

RPM_NAME = "ansible-lint-6.17.2-1.1.noarch.rpm"
RPM_HASH = "c4584cfadf263651bf3f6aa1322cb8d1b824ea8db053cf52166ca03f2cb29104a84a925eafea273bb2ad3c564de378a4793546bb1befbeae13c1d343be3d27f3"
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
python3-rich \
python3-subprocess-tee \
python3-tenacity \
python3-wcmatch \
python3-yamllint"

inherit rpm
