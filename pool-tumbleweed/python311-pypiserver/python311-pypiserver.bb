SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pypiserver-1.5.1-2.3.noarch.rpm"
RPM_HASH = "999640d04f4278488a35dd653c2e0a55348c8631d4c623f7f52c6821b386bc02d3dfabbf10f6f3103b94f5f1fce2791ff7b5869f34aa4fc34224295892809d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypiserver \
python3.11dist-pypiserver \
python311-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-passlib \
python311-setuptools \
update-alternatives"

inherit rpm
