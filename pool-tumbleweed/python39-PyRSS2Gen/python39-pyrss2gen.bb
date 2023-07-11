SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-PyRSS2Gen-1.1-2.15.noarch.rpm"
RPM_HASH = "3a5b4b687501e16931ed449a6b828d2af3408533f79e60b46edae6ac3ed72075722ee9f2c400d6a1c3b8040008ec8565813695ec98e11fd2618139c8b818469e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3.9dist-pyrss2gen \
python39-PyRSS2Gen \
python3dist-pyrss2gen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
