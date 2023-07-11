SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python311-topy-1.1.0-1.13.noarch.rpm"
RPM_HASH = "60b69b2b5487c5d67b27db151b0d234bd41422df962107607b2f17eaaa17d52120295c2fe02432ca168af036ece281ca8dc46fd9ff1dad095e72ba33a3779fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-topy \
python3.11dist-topy \
python311-topy \
python3dist-topy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-regex \
update-alternatives"

inherit rpm
