SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python310-pass-git-helper-1.4.0-1.1.noarch.rpm"
RPM_HASH = "21d714e0d18da70e0472692c3a6c8adf282240f235aa4882a833804c168986f2b26ef6dc46842fe0b845744fcc744352f0630274d8bdd54a8e1dfa10f8875b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pass-git-helper \
python310-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyxdg \
update-alternatives"

inherit rpm
