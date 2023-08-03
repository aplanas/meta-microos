SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python311-flup-1.0.3.dev20161029-4.1.noarch.rpm"
RPM_HASH = "bd3accabf15b5b1e00dad028a21739e1c7a319126dab1ea8a66876f0defd1be0b5f0a2470358aa8c489f84d968e341bb5042309096f22818fa4122ac4797aff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flup \
python3.11dist-flup \
python311-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
