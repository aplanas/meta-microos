SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-textfsm-1.1.3-3.1.noarch.rpm"
RPM_HASH = "3e6d79fdbd3ff11c9100e47fbdab9e193b193fbde00502637c8d5e376694039486ee84962950ae8a3fb7f86648d47dfd52e4b0d9fc4170bf2615b4d1ff3a1206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textfsm \
python39-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
