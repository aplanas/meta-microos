SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-Protego-0.2.1-2.3.noarch.rpm"
RPM_HASH = "921fb01f0c0702757cc6cfeb27d19c4a94a3c6587ed48e7328ba528ec8f2dcb2f16589ce11123b3d38646526b1ad77e4d14b388e03fe1365ebac93033b0891a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(protego) \
python39-Protego \
python3dist(protego)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
