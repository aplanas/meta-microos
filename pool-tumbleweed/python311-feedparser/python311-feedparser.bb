SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python311-feedparser-6.0.10-2.1.noarch.rpm"
RPM_HASH = "6e0852aeb38b9b4504c4ae302f6636a6c703385650700f03252e5e1de103f09ed1b954525e511975f61aa6e85c4c0a69c16ed895038bb31fd9d50c9c93e88cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedparser \
python3.11dist-feedparser \
python311-feedparser \
python3dist-feedparser"

RDEPENDS:${PN} += "python-abi \
python311-sgmllib3k \
python311-xml"

inherit rpm
