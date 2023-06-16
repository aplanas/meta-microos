SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python39-msm-0.8.5-2.14.noarch.rpm"
RPM_HASH = "68e3dab16871beae53f67cc1cf41f072ca60a874cd2e54628165cf9d09e7477398c6704699d506b7e30805676ab196de99b4cae25e928d7c7ba95500378b19c2"
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
