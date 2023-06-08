SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles \
configuration management, application deployment, cloud provisioning, \
ad-hoc task execution, network automation, and multi-node orchestration. Ansible makes complex \
changes like zero-downtime rolling updates with load balancers easy. More information on the Ansible `website <https://ansible.com/>`_."
LICENSE = "GPL-3.0-or-later"

PV = "2.14.5"

RPM_NAME = "ansible-core-2.14.5-2.1.noarch.rpm"
RPM_HASH = "2df0b637f507f4329a5dff4e69cf48e4e04843b33cf2c249eae43ad2edbef464e22442f71ff0eb4c918908cb0b3c3320be2e6da69157fe2a67795f243ebb4204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core config(ansible-core) python3.10dist(ansible-core) python3dist(ansible-core)"
RDEPENDS:${PN} += "(python3-resolvelib >= 0.5.3 with python3-resolvelib < 0.10.0) /usr/bin/python3 python(abi) python3-Jinja2 python3-PyYAML python3-cryptography python3-packaging python3-resolvelib"

inherit rpm
