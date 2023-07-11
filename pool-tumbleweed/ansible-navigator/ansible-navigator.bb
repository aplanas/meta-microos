SUMMARY = "A text-based user interface (TUI) for Ansible"
DESCRIPTION = "A text-based user interface (TUI) for Ansible. \
 \
When running ansible-navigator with no arguments, you will be presented with the welcome page. From this page, you can run playbooks, browse collections, explore inventories, read Ansible documentation, and more. \
 \
A full list of key bindings can be viewed by typing :help."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "ansible-navigator-3.2.0-1.2.noarch.rpm"
RPM_HASH = "84a6fcfbdb6386d7c3856d79b7e6276c8260e451837e89f3c8e86cb36ed93b3f1e2598b6efb02c42f52d7fe25d01b31c612a2f9e49f3ae53275a02b5e85ff727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-navigator \
python3.11dist-ansible-navigator \
python3dist-ansible-navigator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ansible-builder \
ansible-core \
ansible-runner \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-curses \
python3-jsonschema \
python3-onigurumacffi \
python3-pytzdata"

inherit rpm
