SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python311-msm-0.8.5-2.16.noarch.rpm"
RPM_HASH = "1192e1f3d727b74105de1acb002a5b18cf5d46d9472c8c790ca614ed8fa433f7a7c132a0d25edd7bd9753a6d34c5b8ab8bad8b3225dc020156bf4a11934bfa1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msm \
python3.11dist-msm \
python311-msm \
python3dist-msm"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
patch \
python-abi \
python311-GitPython \
python311-PyYAML \
python311-fasteners \
python311-lazy \
python311-pako \
python311-requests \
python311-setuptools \
python311-typing \
update-alternatives"

inherit rpm
