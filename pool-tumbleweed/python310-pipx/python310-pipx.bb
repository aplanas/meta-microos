SUMMARY = "Install and run Python applications in isolated environments"
DESCRIPTION = "Install and run Python applications in isolated environments."
LICENSE = "MIT"

PV = "0.14.0.0"

RPM_NAME = "python310-pipx-0.14.0.0-2.14.noarch.rpm"
RPM_HASH = "e5826bb2f9daa63f413e505cd2dbbc9d9948d78f61212ce25ba2c6ed77024300e33732b81c049a491d7903974ebd81a80272bcb3217cb82e823c24b31b299280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipx \
python3.10dist-pipx \
python310-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-argcomplete \
python310-setuptools \
python310-userpath \
update-alternatives"

inherit rpm
