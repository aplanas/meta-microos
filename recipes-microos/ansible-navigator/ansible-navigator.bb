SUMMARY = "A text-based user interface (TUI) for Ansible"
DESCRIPTION = "A text-based user interface (TUI) for Ansible. \
 \
When running ansible-navigator with no arguments, you will be presented with the welcome page. From this page, you can run playbooks, browse collections, explore inventories, read Ansible documentation, and more. \
 \
A full list of key bindings can be viewed by typing :help."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "ansible-navigator-3.2.0-1.1.noarch.rpm"
RPM_HASH = "e5a5a0224362b18bf33ad7a772acd48de49cea204496b022e8c6649dcfea6abd4d13e753acfb8cf12e86f00a9c355f63b3b8b52452831326de26724f065b8f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-navigator \
python3.10dist(ansible-navigator) \
python3dist(ansible-navigator)"
RDEPENDS:${PN} += "(podman or docker) \
/usr/bin/python3.10 \
ansible-builder \
ansible-core \
ansible-runner \
python(abi) \
python3-Jinja2 \
python3-PyYAML \
python3-curses \
python3-jsonschema \
python3-onigurumacffi \
python3-pytzdata"

inherit rpm
