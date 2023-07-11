SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python311-sambacc-v0.2+git.108.e7850e0-1.3.noarch.rpm"
RPM_HASH = "929784d55279b3cb56f8978423941fe8f1ddb0331f587857f60cc95bdee19cc9efbe4effe3ff2369091891438a843eb46d59281f5bb3287d24e79354f2c75197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sambacc \
python311-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
