SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-unidiff-0.7.4-1.7.noarch.rpm"
RPM_HASH = "dcfcdd7aa123fda6d5492b276978181ca016f976146a01a5c8667a867d6ab9093729a871ca2701b46a4a403b2eb32466e000437c2335c6799f2919522097c26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unidiff \
python3.11dist-unidiff \
python311-unidiff \
python3dist-unidiff"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
