SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python39-duckduckgo2-0.242-3.14.noarch.rpm"
RPM_HASH = "220e4dee034d39aa46b7cd291479652722596266f8c0bcce5690ce66590394f7ad5a93383a6ba01d29eb0b8db89ea288aa340a4b96dbd58a404cdbc7e115fcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-duckduckgo2 \
python39-duckduckgo2 \
python3dist-duckduckgo2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
