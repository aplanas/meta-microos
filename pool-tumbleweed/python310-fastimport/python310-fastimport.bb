SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python310-fastimport-0.9.14-2.2.noarch.rpm"
RPM_HASH = "6650d8113423de6bc85ae9a3daedbf7794b0053579eced3b73d74e5e02bf4ea1305da140b4b26da9d6520be55dd09febf1785fc00e9ec9b69894e5ac43737dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fastimport \
python310-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
