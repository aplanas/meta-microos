SUMMARY = "Mycroft Skills Manager"
DESCRIPTION = "msm is Mycroft Skills Manager, a command line tool to install/list/remove \
Mycroft skills."
LICENSE = "Apache-2.0"

PV = "0.8.5"

RPM_NAME = "python310-msm-0.8.5-2.14.noarch.rpm"
RPM_HASH = "99943aa9a69b0ade9eed2f55dc5e493d22c607f5068b1d1df21133f3a13b4c9eac369b1c4f8f6bc61ccc9e9ac541f4a05fa942a28cdc96397f47ad9c1fd45cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msm \
python3.10dist(msm) \
python310-msm \
python3dist(msm)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
patch \
python(abi) \
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
