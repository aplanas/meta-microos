SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A set of CLI tools intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "sambacc-v0.2+git.108.e7850e0-1.3.noarch.rpm"
RPM_HASH = "fd79def5def4f9ce4075b8e66cc4b55eca1e1f779dc9da080f31d1f944c22a7b1058f636901b66462fc69f634edfda0026ce583f0703fa7765f26b0580504b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sambacc"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-sambacc"

inherit rpm
