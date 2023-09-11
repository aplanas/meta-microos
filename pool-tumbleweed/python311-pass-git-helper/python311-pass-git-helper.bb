SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python311-pass-git-helper-1.4.0-1.1.noarch.rpm"
RPM_HASH = "f206153f53a609609853d3a0c9635f0edbf13ebf3a27b192886197164067a26f354dfc9834eac5eea4701f36337ebfa47c26e31d8b6fef5cec594833f40477df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pass-git-helper \
python3.11dist-pass-git-helper \
python311-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pyxdg \
update-alternatives"

inherit rpm
