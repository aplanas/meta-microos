SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-git-pw-2.4.0-2.4.noarch.rpm"
RPM_HASH = "e278a9eecefddb8c0207005b9bc1bd804c419982e89c65fdf6a838e0aa502bf793ce88f2d7a65de5d7cc566d1ca469febadeeebda15a33635911a8cfdab4e26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3-git-pw \
python3.11dist-git-pw \
python311-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-arrow \
python311-click \
python311-pyaml \
python311-requests \
python311-tabulate \
update-alternatives"

inherit rpm
