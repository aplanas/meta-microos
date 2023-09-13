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

PV = "2.15.3"

RPM_NAME = "ansible-test-2.15.3-1.1.noarch.rpm"
RPM_HASH = "dec079bceb1b7b6d6e18e7125b27152a83080b86563e3b816ea00791b825a3400a3473595f6051ce3d538af04379eea52cebea5e055b295875c365c82a436059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python-abi \
python3-virtualenv"

inherit rpm
