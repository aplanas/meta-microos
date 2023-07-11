SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python310-feedparser-6.0.10-2.1.noarch.rpm"
RPM_HASH = "5eb09e260f17717f6bf421fbea823ba527f4506d3d01038d84ee0381a6b7c3a0543cbf58d9db4b8576f14fc6109a98413dcb5c38b7dcbb00f4778265999e2940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-feedparser \
python310-feedparser \
python3dist-feedparser"

RDEPENDS:${PN} += "python-abi \
python310-sgmllib3k \
python310-xml"

inherit rpm
