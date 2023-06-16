SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python39-fastimport-0.9.14-2.1.noarch.rpm"
RPM_HASH = "1ad3209aff0bc1af8d36561692c309552b7fdbe7e570c37c61e65c12ba36550693f6be0fc01ba828a76cd56ac3faac13e06e1bd02ee6d3a463d1d72d0b270c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fastimport \
python39-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
