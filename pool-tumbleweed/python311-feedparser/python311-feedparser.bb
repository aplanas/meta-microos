SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python311-feedparser-6.0.10-1.5.noarch.rpm"
RPM_HASH = "53ad6c349de5fd40ada5ad7dbcc1fe8f1aa14bfa3453445960aa6ec9720b1ec5d33594a698f28866f60a48525a1975df0d72021bd7e67994e2ce2870f0bc8418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(feedparser) \
python311-feedparser \
python3dist(feedparser)"
RDEPENDS:${PN} += "python(abi) \
python311-sgmllib3k \
python311-xml"

inherit rpm
