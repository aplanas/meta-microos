SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python39-ana-0.06-4.1.noarch.rpm"
RPM_HASH = "1f12e9c62c82f306e65907bcd7aab4c5fbfb1eb7246b5dadf04ad5302fb96de170cbb2e184adafb033def78af39cd08ec62b69bdb5b6c6c210f196941bc09a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ana \
python39-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi"

inherit rpm
