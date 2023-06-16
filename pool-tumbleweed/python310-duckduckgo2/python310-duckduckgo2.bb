SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python310-duckduckgo2-0.242-3.13.noarch.rpm"
RPM_HASH = "99a65d2e404758c50776135327226e26ac28fbb2552627635c695ffc8d9973a79150d5513ffc085448236b3a0e6db0791a1097bf7a047618630387d7c2c5dcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duckduckgo2 \
python3.10dist-duckduckgo2 \
python310-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
