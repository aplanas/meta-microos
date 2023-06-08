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

PV = "2.14.5"

RPM_NAME = "ansible-test-2.14.5-2.1.noarch.rpm"
RPM_HASH = "ad75025a0208ffdb4e60000cb26ab2400e9832be8a9b6c7671b84a8ccc9bcb885d04d50043a49ce1c60738e48a0b096f683da9210e52b5aa852b51efb0cf0ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-test"
RDEPENDS:${PN} += "/usr/bin/python3 ansible-core python(abi) python3-virtualenv"

inherit rpm
