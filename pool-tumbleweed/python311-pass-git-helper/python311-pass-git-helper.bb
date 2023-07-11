SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python311-pass-git-helper-1.2.0-1.6.noarch.rpm"
RPM_HASH = "e8955a8833fb6af1dc316921cc4e20c9a955d88a098d6ecb1f2f2eb151ff39da3a06f77b1130b262382d348e78aaa208978439e479082344cfeff8f5cc26134e"
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
