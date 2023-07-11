SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-biplist-1.0.3-4.10.noarch.rpm"
RPM_HASH = "0914b125b13232a18279d80c8dce3badf7c3021cb7d3a12a04213de0944ecd9243d82e3d97260e4a02ccf8df6457ecb93620239a7d2b4bdde338a9d161589230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-biplist \
python3.11dist-biplist \
python311-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
