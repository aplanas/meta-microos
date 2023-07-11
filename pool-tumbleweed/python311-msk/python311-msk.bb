SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-msk-0.4.0-1.5.noarch.rpm"
RPM_HASH = "f6536989e20d855517dbab99ff1906446bed5a22990d9c6d47f643608a585c85d461b958d0b137f404200ca612619ac752b16cb0598f429c0b4b869384c60b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msk \
python3.11dist-msk \
python311-msk \
python3dist-msk"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-GitPython \
python311-PyGithub \
python311-msm \
update-alternatives"

inherit rpm
