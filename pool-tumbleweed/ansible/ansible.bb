SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0+"

PV = "8.1.0"

RPM_NAME = "ansible-8.1.0-1.1.noarch.rpm"
RPM_HASH = "52199b63abe2c9e520828e66f889733ee1fdd691ed78740627cade9aac74e1b220da6ec66d8fba2d7cd427126231e6cfa93804c77666bbdb21e686045d864b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible \
python3.11dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python3-base"

inherit rpm
