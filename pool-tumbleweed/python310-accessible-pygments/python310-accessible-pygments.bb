SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python310-accessible-pygments-0.0.4-1.4.noarch.rpm"
RPM_HASH = "b3856b00c936f8bc2207bdf7f597260c70f7fe654b857888b40880580c4c1a60117b20bb161645c9d8f063e7591abf931df517c9f0fb11cb8a83eb63fe0692f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-accessible-pygments \
python310-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python310-pygments"

inherit rpm
