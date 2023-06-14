SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-git-pw-2.4.0-2.2.noarch.rpm"
RPM_HASH = "6cfddc60825af4060d1f25135bf488d76675a6de372725aa562b9af3db80d8438aed028da139466d2b306b843f21c1cae220a8494c90d48318a6542a88591dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3.11dist-git-pw \
python311-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
git-core \
python-abi \
python311-arrow \
python311-click \
python311-pyaml \
python311-requests \
python311-tabulate \
update-alternatives"

inherit rpm
