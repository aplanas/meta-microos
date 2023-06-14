SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python310-sambacc-v0.2+git.108.e7850e0-1.1.noarch.rpm"
RPM_HASH = "c7fe8984d66ae454ea45e00b8c7c8e1d78611f20d2881a7246a7bdd67f76fce7227d087d1a6fd1813abc98ecc1e26b0dd634af0551d8fce431cb7914fb6bee96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sambacc \
python310-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
