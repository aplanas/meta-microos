SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-sphinx-argparse-0.4.0-1.3.noarch.rpm"
RPM_HASH = "1f663636776fc2e81e1c7023e649f9514f7dd3625333f0b8e9c307687475407084c8ad112b3adde7ec4aa429dea8fa6a1920a46717936ad73978d71ad88ef73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-argparse \
python39-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
