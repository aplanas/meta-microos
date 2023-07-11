SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python39-topy-1.1.0-1.13.noarch.rpm"
RPM_HASH = "b736cab6371062b5f2f1a972930aaa89a14c2cd23bec060305eaa6f81e4ff4c97ec87ec85c8db063b1cb0ba3bc919b643580054e5f556502e1cc789a99d92a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-topy \
python39-topy \
python3dist-topy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-regex \
update-alternatives"

inherit rpm
