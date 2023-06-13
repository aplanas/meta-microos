SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python39-topy-1.1.0-1.11.noarch.rpm"
RPM_HASH = "41041047dd6a256dcbbf1d296c5f52ff1ef025fa7d979a2884a34cd5bad0f31339f54c3730b9d0f8d4dffdb660b0cf87b67884d1f96d415c956ff74dae6453a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(topy) \
python39-topy \
python3dist(topy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-regex \
update-alternatives"

inherit rpm
