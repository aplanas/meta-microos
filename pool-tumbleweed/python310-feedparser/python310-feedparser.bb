SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python310-feedparser-6.0.10-1.5.noarch.rpm"
RPM_HASH = "67f3e2908db2664d1574e181bff66d4afef8949291436c2c66017fc44b0ecd6fd7ba1da2a6cb0381eedc6731bfaebb5b57320453898426d7a9cadeebf516dc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedparser \
python3.10dist(feedparser) \
python310-feedparser \
python3dist(feedparser)"

RDEPENDS:${PN} += "python(abi) \
python310-sgmllib3k \
python310-xml"

inherit rpm
