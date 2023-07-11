SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-unidiff-0.7.4-1.7.noarch.rpm"
RPM_HASH = "6c333a3d8a2308f9de3fc7c426194067eb680058b4c75998961a0008438b67913e09e54994b19ec4d867fa98101e7f5bba5be9e33d08eb2b99b96ccf9cc2f518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unidiff \
python310-unidiff \
python3dist-unidiff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
