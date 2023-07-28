SUMMARY = "Tool for testing ansible plugin and module code"
DESCRIPTION = "This package installs the ansible-test command for testing modules and plugins \
developed for ansible. \
 \
Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0-or-later"

PV = "2.15.2"

RPM_NAME = "ansible-test-2.15.2-1.1.noarch.rpm"
RPM_HASH = "adc9c220b9821e134198528dbbcf3253d9cad248944d6cf253273a5bd155241fad258b4766fd4e7cecdd923c861abec0851afc6f4371081fad94e11dd945b4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python-abi \
python3-virtualenv"

inherit rpm
