SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python39-httplib2-0.22.0-3.1.noarch.rpm"
RPM_HASH = "16e5cbe1f7a661994f5b453654526bf8f8e581e52aad71c9e71acb553ba6f6a7869969670a95f768d6b00a0063e8b2605be9e006ada77e421b9921c64be5976b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httplib2 \
python39-httplib2 \
python3dist-httplib2"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python39-certifi \
python39-pyparsing"

inherit rpm
