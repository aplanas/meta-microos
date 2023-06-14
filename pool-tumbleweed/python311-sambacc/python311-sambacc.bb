SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python311-sambacc-v0.2+git.108.e7850e0-1.1.noarch.rpm"
RPM_HASH = "c3555ce0ec9ce0cd3315cf98eea22ba70998b3f79fa099d695047f3727b38bea1cd8ad97d29d469a3e672cd90ddcec083794a2d8d557abb129a0be8044f1196c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
