SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python311-jsonpatch-1.32-4.3.noarch.rpm"
RPM_HASH = "3c24a16dfe773a72f1a0974f75e398ac309ac5720aa7a6e342a9deb0d45162644f6828c5af2d8530b3ac993da9e6e4b36825489a85ebebf2fb0fe8a7fd1cde91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpatch \
python3.11dist-jsonpatch \
python311-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-jsonpointer"

inherit rpm
