SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles \
configuration management, application deployment, cloud provisioning, \
ad-hoc task execution, network automation, and multi-node orchestration. Ansible makes complex \
changes like zero-downtime rolling updates with load balancers easy. More information on the Ansible `website <https://ansible.com/>`_."
LICENSE = "GPL-3.0-or-later"

PV = "2.15.3"

RPM_NAME = "ansible-core-2.15.3-1.1.noarch.rpm"
RPM_HASH = "3856f78b38e6e5dec52e53dd0f0c77135ed7a1677b71e2f00132eb3e4d93b6b2b55bdbe5bb6bc00831c10d2586f4b4331723a8e5751372b89acf531025143b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-core \
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
