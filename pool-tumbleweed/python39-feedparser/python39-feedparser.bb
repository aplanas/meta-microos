SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python39-feedparser-6.0.10-2.1.noarch.rpm"
RPM_HASH = "c6adffd0029c60aa41397ec40cfab60670fbfc5430a8df3f26cf46e5db8ff298fd4117bc87ebc8ed4bbf39da54674ad10a200605e7e92e8e90675123a6899153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-feedparser \
python39-feedparser \
python3dist-feedparser"

RDEPENDS:${PN} += "python-abi \
python39-sgmllib3k \
python39-xml"

inherit rpm
