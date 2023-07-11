SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python310-topy-1.1.0-1.13.noarch.rpm"
RPM_HASH = "af5f8d47118a1452e99dfcdcbb1f6569fb53577824b47de80eece02c52df065ecd4b5254d9e42f23d055c17c194addc5cef90f6da1a9670f82cd15c21b2fa338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-topy \
python310-topy \
python3dist-topy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-regex \
update-alternatives"

inherit rpm
