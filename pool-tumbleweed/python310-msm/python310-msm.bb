SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python310-msm-0.8.5-2.16.noarch.rpm"
RPM_HASH = "8d830aab208da7cefee41b2cd404b502e20e1dc316446361f0bc0e43355ec9868a0335ae060f60dad6e8e4211276659bf0fd5e38e0b9b614de5cf7ee8ec0dc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msm \
python310-msm \
python3dist-msm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
patch \
python-abi \
python310-GitPython \
python310-PyYAML \
python310-fasteners \
python310-lazy \
python310-pako \
python310-requests \
python310-setuptools \
python310-typing \
update-alternatives"

inherit rpm
