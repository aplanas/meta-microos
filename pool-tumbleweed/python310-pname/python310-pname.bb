SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-pname-1.0.2-1.13.noarch.rpm"
RPM_HASH = "b3ce80850284f54b6e9c2286736cdab05479d1f09d52b2d1d2cba416f2ee12755088b0294564652c252d240b05bb22f010f1e644505c1f52ff783df4e0a308cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pname \
python3.10dist(pname) \
python310-pname \
python3dist(pname)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
