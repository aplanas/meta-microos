SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python310-anyascii-0.3.2-1.2.noarch.rpm"
RPM_HASH = "e911de4ca6334d6973d4399aee2115a316a72b6d118dcedda405ad70dc246033916b05d22f5a7228c42fb57e32b0efbccab15660c4960b76bf075cbc1b248c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anyascii \
python310-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
