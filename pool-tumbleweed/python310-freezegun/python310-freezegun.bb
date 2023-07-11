SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python310-freezegun-1.2.2-2.3.noarch.rpm"
RPM_HASH = "d5c96d26c3a673b6aa750c1f1e282b540835fe8261a133fcadd26d6b04bd8c507d8f026c17ab5839466f64ff71f7f5977fadd7e3d4d7aed29c436337f267414b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-freezegun \
python310-freezegun \
python3dist-freezegun"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-python-dateutil"

inherit rpm
