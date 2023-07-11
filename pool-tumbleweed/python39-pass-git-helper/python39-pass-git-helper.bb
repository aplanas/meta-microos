SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python39-pass-git-helper-1.2.0-1.6.noarch.rpm"
RPM_HASH = "5cc2a865c2b693181784fcc5273c3cbecbffab45596db1a95408f1654118d24d278569f308db8e8b06f7bcfb900fab60b78269e8f9ef747f30d40331508d79c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pass-git-helper \
python39-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyxdg \
update-alternatives"

inherit rpm
