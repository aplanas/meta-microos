SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles \
configuration management, application deployment, cloud provisioning, \
ad-hoc task execution, network automation, and multi-node orchestration. Ansible makes complex \
changes like zero-downtime rolling updates with load balancers easy. More information on the Ansible `website <https://ansible.com/>`_."
LICENSE = "GPL-3.0-or-later"

PV = "2.15.1"

RPM_NAME = "ansible-core-2.15.1-1.1.noarch.rpm"
RPM_HASH = "87bc107c91bd509bf8908e4b39c1fb3594270e004db7894871bffbfed5cd89a157cda2e17011efbf16c6d8ef8d0e2c2f422c1049f3805fb6aa2717c944022d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
config-ansible-core \
python3.11dist-ansible-core \
python3dist-ansible-core"

RDEPENDS:${PN} += "-python3-resolvelib >= 0.5.3 with python3-resolvelib < 1.1.0 \
/usr/bin/python3 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-cryptography \
python3-packaging"

inherit rpm
