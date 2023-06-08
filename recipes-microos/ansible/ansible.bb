SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0+"

PV = "7.5.0"

RPM_NAME = "ansible-7.5.0-1.1.noarch.rpm"
RPM_HASH = "c6b83d3ab972594daefe3ff1cd10d43b6387ea9c8e6856a253ab9d53242c2a77dec297ff20e4b76632f9d1b43f6438728c61ae36d25fde089e62b27e23eb8cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible python3.10dist(ansible) python3dist(ansible)"
RDEPENDS:${PN} += "/usr/bin/python3 ansible-core python3-base"

inherit rpm
