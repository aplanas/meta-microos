SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python39-jsonpatch-1.32-4.3.noarch.rpm"
RPM_HASH = "220bc45df63fa7ae5d8d1da88a4ca50f3395f6d3149e340c7a2cca1cacaa3a3762b56f53c85f479f0f988f631ff93864459472078e8756445525daca6e253091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonpatch \
python39-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-jsonpointer"

inherit rpm
