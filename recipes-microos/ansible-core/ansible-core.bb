SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles \
configuration management, application deployment, cloud provisioning, \
ad-hoc task execution, network automation, and multi-node orchestration. Ansible makes complex \
changes like zero-downtime rolling updates with load balancers easy. More information on the Ansible `website <https://ansible.com/>`_."
LICENSE = "GPL-3.0-or-later"

PV = "2.15.0"

RPM_NAME = "ansible-core-2.15.0-1.1.noarch.rpm"
RPM_HASH = "abb22a814a9ee3c1f5fa0ac40c73f95c0f55f006aa8e2dc9ea042887c8f027161a210066f9ca44a81a65ea32406b784c7b7dabe79adc00332d0dba731eb90d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core config(ansible-core) python3.10dist(ansible-core) python3dist(ansible-core)"
RDEPENDS:${PN} += "(python3-resolvelib >= 0.5.3 with python3-resolvelib < 1.1.0) /usr/bin/python3 python(abi) python3-Jinja2 python3-PyYAML python3-cryptography python3-packaging"

inherit rpm
