SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python311-flup-1.0.3.dev20161029-3.2.noarch.rpm"
RPM_HASH = "67fdc68f4bf580972ad29084cb56701a172bce9090f0fa86f42ed53c281825904a66a68714d42f60dfea03c98f5a45942679a7563586c3f0561282cc7564ee62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flup \
python3.11dist-flup \
python311-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
