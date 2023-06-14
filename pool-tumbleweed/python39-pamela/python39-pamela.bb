SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pamela-1.0.0-1.13.noarch.rpm"
RPM_HASH = "0b6dd989c81f5c0ba1d94569e9e361aa2252938c1940d4ad0c4d6043649dbae961783a39c5e4442be818b55d545fa08241044dd855e008a5b82f19de1ea5035f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pamela \
python39-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
