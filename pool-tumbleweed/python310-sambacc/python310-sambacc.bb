SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python310-sambacc-v0.2+git.108.e7850e0-1.3.noarch.rpm"
RPM_HASH = "37e9db87062c5de3a133564930b6f38cd4d441a6eb02272d00f1a8d98c0892d12394f30fe6b87f12bf22f2c8ca662635ab07c8dee7e638639ed8dbd45477e45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
