SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-typeguard-4.0.0-1.3.noarch.rpm"
RPM_HASH = "742e59b9bb0465375f591e571603c95fdcf530b520dc499f9271fc348ee07d763734f007c09838e97cfc5d7f5f8fafc8941c546e6fdad38b6d68e829f34301e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typeguard \
python310-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata \
python310-typing-extensions"

inherit rpm
