SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-biplist-1.0.3-4.8.noarch.rpm"
RPM_HASH = "e116568f4b4cf97ee53ce4268cdca9f2e3cb6b86635ccabde2e5d46643865fe83b2955ff0e8b5e789556a2e71398f9fa574a0801181709920330089717d6210f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-biplist \
python39-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
