SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python311-anyascii-0.3.2-1.2.noarch.rpm"
RPM_HASH = "c9450e5fde1f8d580f1b02bc8736099dc62ad285f727bf5efe25426eabf39a86cceb48ee84c76ba732316691892053f8df7189abe8d69bc3e8911e456ad589ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyascii \
python3.11dist-anyascii \
python311-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
