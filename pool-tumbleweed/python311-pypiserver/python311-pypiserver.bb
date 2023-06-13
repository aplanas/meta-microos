SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pypiserver-1.5.1-2.1.noarch.rpm"
RPM_HASH = "d7034e8dcabdc6177997e21fc49d60cb727b696f49624b0799c1f5763b2394742f58da32f68bdfda319a315e1557f90c77d1eb90423b848278ac59ee171a14be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypiserver) \
python311-pypiserver \
python3dist(pypiserver)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-passlib \
python311-setuptools \
update-alternatives"

inherit rpm
