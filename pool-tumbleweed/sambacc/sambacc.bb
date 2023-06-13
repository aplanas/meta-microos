SUMMARY = "Samba Container Configurator"
DESCRIPTION = "A set of CLI tools intended to act as a bridge between a container \
environment and Samba servers and utilities. It aims to consolidate, coordinate and \
automate all of the low level steps of setting up smbd, users, groups, and other \
supporting components."
LICENSE = "GPL-3.0-or-later"

PV = "v0.2+git.108.e7850e0"

RPM_NAME = "sambacc-v0.2+git.108.e7850e0-1.1.noarch.rpm"
RPM_HASH = "4ee6ccc46b039ddd1a16122795cf12d8fef082c87b6cbbd6b37d8912b485ceb5abd1132c64673e89eaa2246757c04ab77b3cdfdbaaee724395f45d4e82738228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sambacc"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-sambacc"

inherit rpm
