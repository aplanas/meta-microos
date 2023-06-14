SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python311-pass-git-helper-1.2.0-1.4.noarch.rpm"
RPM_HASH = "cac2f324557ff921805b4dcc62ffc6410cdc6fd26836ff519dc6099b2bad925b34ff43ba6afd3b732c1fd6d0b7c985c548172d3ddb7a97fef0e0d956291fb026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pass-git-helper \
python311-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-pyxdg \
update-alternatives"

inherit rpm
