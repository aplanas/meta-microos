SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-click-aliases-1.0.1-3.14.noarch.rpm"
RPM_HASH = "3f71acda74c9552c2f7eb435c7109607af62a7ec1798a1b53dd2afb566f1559bd59cac381d748a1b214e2ca326048b07de7f283b3b2f351929caa56b63ea4940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-aliases \
python39-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
