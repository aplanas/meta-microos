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

PV = "2.15.0"

RPM_NAME = "ansible-test-2.15.0-1.1.noarch.rpm"
RPM_HASH = "7cb693c63ce1e1197830df65f7915c1e1aa94740d086e1bc48e38bfffa9c938da65a10b0d8bbe3911899373f398454b61642e448105cfc0009e3091ea2b7975c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ansible-core \
python(abi) \
python3-virtualenv"

inherit rpm
