SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python311-tokenize-rt-4.2.1-1.11.noarch.rpm"
RPM_HASH = "d1034b437126e42094530de63cc4ec4e0d08f09a96942b14150931b44f00c1ea4dc3b5da5caac7efab3450d98b6729caae3b627ee0953f159a95f3ece53d1e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tokenize-rt \
python3.11dist-tokenize-rt \
python311-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
