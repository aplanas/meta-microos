SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pamela-1.0.0-1.15.noarch.rpm"
RPM_HASH = "15fa66c334775e591f78e7d87f0bf473d7c5f1ee56cf96cb5b36079ab0d9178d1b0cd4ee1c956ac8bfd38aaca123633714d6004495042b1ba527fd100dcc6dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pamela \
python39-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
