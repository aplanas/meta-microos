SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-PyRSS2Gen-1.1-2.15.noarch.rpm"
RPM_HASH = "0edb4e5408fe100157d8c4c0e67f24f0fc407db878f5910acae33f636953eb841c12f75af5f85f887f8b13cce4c293d558a07d57de616db57b67f36c10387985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3-PyRSS2Gen \
python3.11dist-pyrss2gen \
python311-PyRSS2Gen \
python3dist-pyrss2gen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
