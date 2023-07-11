SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pypiserver-1.5.1-2.3.noarch.rpm"
RPM_HASH = "07e78220fcb8ac87e4ee8d19acaf5b61f675ce57b3d265f2c34376cab22c73223c99b46e98b8c607deb07aa94321a57da56b52617e57074503929fa71e3bfffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypiserver \
python310-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-passlib \
python310-setuptools \
update-alternatives"

inherit rpm
