SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python311-fastimport-0.9.14-2.1.noarch.rpm"
RPM_HASH = "58f680b41d55a04926c870a7f049006c07113b07a916a601dce03959e066e64097b3b9305fadc02516dde92cc11d6ff888a6de0e9f3b0151508886352ddef0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fastimport \
python311-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
