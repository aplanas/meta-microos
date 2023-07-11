SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A Python library intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "python39-sambacc-v0.2+git.108.e7850e0-1.3.noarch.rpm"
RPM_HASH = "6ae2e9f23ee922343f2bc9f1c0e0912691076225f4ecf076436007e07d9384ff84f555321dba8abd8fdb22f7fe22b1873e0f9648532d990efad55bcd629fa510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sambacc"

RDEPENDS:${PN} += "python-abi \
python3-pyxattr \
samba-python3"

inherit rpm
