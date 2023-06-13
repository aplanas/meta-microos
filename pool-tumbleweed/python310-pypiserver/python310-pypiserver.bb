SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pypiserver-1.5.1-2.1.noarch.rpm"
RPM_HASH = "b56ff716d3d9c48b825e576bf316b2df5df4eda6ca99a4062963462159e7c9af2acc32603cf8883d70f33f6741a49b3525d67e9f2e6a745eacb51fe87ffbca08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypiserver \
python3.10dist(pypiserver) \
python310-pypiserver \
python3dist(pypiserver)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-passlib \
python310-setuptools \
update-alternatives"

inherit rpm
