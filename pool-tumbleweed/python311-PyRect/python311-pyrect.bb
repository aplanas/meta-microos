SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-PyRect-0.2.0-1.3.noarch.rpm"
RPM_HASH = "10d2113ef9b0d6c3145fcc8168c425a03cd8bcac8d475ecef7c464fa869c7baf8f7cda269b3348b717ba76709b3e7b1aab6d1ac8c910d715135afa8834b9d847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyrect \
python311-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
