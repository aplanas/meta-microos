SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple IT automation system. It handles \
configuration management, application deployment, cloud provisioning, \
ad-hoc task execution, network automation, and multi-node orchestration. Ansible makes complex \
changes like zero-downtime rolling updates with load balancers easy. More information on the Ansible `website <https://ansible.com/>`_."
LICENSE = "GPL-3.0-or-later"

PV = "2.15.2"

RPM_NAME = "ansible-core-2.15.2-1.1.noarch.rpm"
RPM_HASH = "6ea0ec0cc6a0134c4ad02d058da92962fc481eddbbc191e3808ab6e91fde2755d557a44c439d3a530dadfc9e580621e35c2bd4889076763bfed1b89053a2e069"
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
