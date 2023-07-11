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

PV = "2.15.1"

RPM_NAME = "ansible-test-2.15.1-1.1.noarch.rpm"
RPM_HASH = "2e13d94ee5df47b9d7771d6efa9006f16f64e0749a5ec35870f4ba9000dece0a97928bbb89e500508054f638213fe1301c79001ada35f78d1a154f3325302b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python-abi \
python3-virtualenv"

inherit rpm
