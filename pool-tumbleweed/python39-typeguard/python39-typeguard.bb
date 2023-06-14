SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-typeguard-4.0.0-1.1.noarch.rpm"
RPM_HASH = "c34762f97da4850bd2b508728416abc6697e9acc4de03521ca8c3b346e765c5898c7a4956fc7bb37eb15b3aa65da0ea4470f3d05a14bec8f2d553a2ff0752629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typeguard \
python39-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-typing-extensions"

inherit rpm
