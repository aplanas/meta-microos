SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0+"

PV = "8.2.0"

RPM_NAME = "ansible-8.2.0-1.1.noarch.rpm"
RPM_HASH = "6cd02db5cde8954d59beadd1943fb8e73b505b9393d1f970eaa9cff65d24afb30cb3d49c53845f83d1ffed1f2b5899d2b3ad3caf68dc5b0b91c917f07259748a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible \
python3.11dist-ansible \
python3dist-ansible"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python3-base"

inherit rpm
