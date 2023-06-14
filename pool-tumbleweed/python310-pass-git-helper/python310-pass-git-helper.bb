SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python310-pass-git-helper-1.2.0-1.4.noarch.rpm"
RPM_HASH = "c5984ec82318129c11d851cc7ad06ff7b2bf96f0913de11dbbdcf06a5ab3d705b433025bced6bb08e9796f92664b9058e4f28b2973e86689b15e4dee0c5c5fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pass-git-helper \
python3.10dist-pass-git-helper \
python310-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-pyxdg \
update-alternatives"

inherit rpm
