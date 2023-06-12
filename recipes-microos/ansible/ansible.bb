SUMMARY = "Radically simple IT automation"
DESCRIPTION = "Ansible is a radically simple model-driven configuration management, multi-node \
deployment, and remote task execution system. Ansible works over SSH and does \
not require any software or daemons to be installed on remote nodes. Extension \
modules can be written in any language and are transferred to managed machines \
automatically."
LICENSE = "GPL-3.0+"

PV = "8.0.0"

RPM_NAME = "ansible-8.0.0-1.1.noarch.rpm"
RPM_HASH = "0d885933ca8f2aecafa1a503af0272159390ac488287eb4ecbf5967f4c7060392f27b076d5576208fc50f03807878aaca9afe7a59225e9789661cf07df28e9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible python3.10dist(ansible) python3dist(ansible)"
RDEPENDS:${PN} += "/usr/bin/python3 ansible-core python3-base"

inherit rpm
