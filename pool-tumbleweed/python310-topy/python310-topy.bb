SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python310-topy-1.1.0-1.11.noarch.rpm"
RPM_HASH = "d2e965ab573ecef4244848b2bd798c7c7e5f5b4e6d6b12e2ee68f404bdf211fad5c2df5f7d07509fd2970c2b6a8c4148984096dc8a34b35b6c7d3321cd9b6833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-topy \
python3.10dist(topy) \
python310-topy \
python3dist(topy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-beautifulsoup4 \
python310-regex \
update-alternatives"

inherit rpm
