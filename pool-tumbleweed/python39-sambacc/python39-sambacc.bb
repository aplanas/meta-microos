SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python39-sambacc-v0.2+git.108.e7850e0-1.1.noarch.rpm"
RPM_HASH = "d5f197859cba954fa9e889d570c035feba1e2500dc90025b60171abbf80f85953b5a10e9fd7369ac49c9813eb9cc4ad8f32efbf09e4af76f936922db3d58143d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
