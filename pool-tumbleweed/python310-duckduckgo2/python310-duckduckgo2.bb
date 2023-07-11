SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python310-duckduckgo2-0.242-3.14.noarch.rpm"
RPM_HASH = "430bc12cded1fe75290e00ca5222daaa47aff423e805ba04b6a088dc41bfa51314ca834bb9b6ea47e5f53471f304d11e009c43c21ddcc27fbd6ed43f7fabf8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-duckduckgo2 \
python310-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
