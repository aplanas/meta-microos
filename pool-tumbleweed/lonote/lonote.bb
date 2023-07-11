SUMMARY = "A personal note-taking application"
DESCRIPTION = "Lonote is a personal note-taking application based on python3 \
and modern browsers. \
It features in well interact UI, minimal design, structural notes, \
auto reloading, archiving and versioning."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "3.2.13"

RPM_NAME = "lonote-3.2.13-3.8.noarch.rpm"
RPM_HASH = "2077826401cdd80b5f7743493051e34f1588ed60b1ca230e5e6ee146807abe01846872b06121ebd5701f1cae60d8a6dcd9e7cbd7c97c47e3cb07cfb3bc3e8725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lonote \
python3.11dist-lonote \
python3dist-lonote"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbm \
python3-xml"

inherit rpm
