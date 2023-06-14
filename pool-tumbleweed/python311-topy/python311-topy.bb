SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "MIT & CC-BY-SA-4.0"

PV = "1.1.0"

RPM_NAME = "python311-topy-1.1.0-1.11.noarch.rpm"
RPM_HASH = "24c02c49e2ff93b54fd89bc0fefdcfc9548e965e82fa6387049d8f1666f60bbd7f91f84195f2e19285268e0f538ab82485363e9761c1b032f70f425e111344ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-topy \
python311-topy \
python3dist-topy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-beautifulsoup4 \
python311-regex \
update-alternatives"

inherit rpm
