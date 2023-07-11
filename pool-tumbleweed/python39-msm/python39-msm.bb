SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python39-msm-0.8.5-2.16.noarch.rpm"
RPM_HASH = "72abff4d074d99119fff5754885e0a3c68d0ba67437f7bcde2c36bee6febe5751b8c6e10917ec0aa0df009f3268f6f97a2a36b3363da7b4a7f7aee0282d5909b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msm \
python39-msm \
python3dist-msm"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
patch \
python-abi \
python39-GitPython \
python39-PyYAML \
python39-fasteners \
python39-lazy \
python39-pako \
python39-requests \
python39-setuptools \
python39-typing \
update-alternatives"

inherit rpm
