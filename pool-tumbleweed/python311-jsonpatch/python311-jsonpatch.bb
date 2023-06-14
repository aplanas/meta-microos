SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python311-jsonpatch-1.32-4.1.noarch.rpm"
RPM_HASH = "76eabd625554f23e1a959d1458b5434e07e9e15c572bbab77dafb7ef653205be399f22f202f0196acd17d2a6b3ca0dbb2ec0e3219178257a866c0a215db274cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonpatch \
python311-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python-abi \
python311-jsonpointer"

inherit rpm
