SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pypiserver-1.5.1-2.1.noarch.rpm"
RPM_HASH = "683632ecb80a4f99bf16206213c0bba15a2a0eccc1b4cda19d1fc4ef4faaca60ef275c33b719fae36e964dcbfc0f0a5eb61c905ce43cd3394a26e53d76905d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypiserver \
python39-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-passlib \
python39-setuptools \
update-alternatives"

inherit rpm
