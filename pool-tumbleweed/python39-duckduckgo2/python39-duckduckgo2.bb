SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python39-duckduckgo2-0.242-3.13.noarch.rpm"
RPM_HASH = "99088a1006750bd0fdcb720c20f8f0601f518a251236194a4d3b0acdd253af86c60c5054cb7873908eb14f59c64a6ee3fba28981098501864d877039eb98a84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-duckduckgo2 \
python39-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
