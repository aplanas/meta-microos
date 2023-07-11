SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-biplist-1.0.3-4.10.noarch.rpm"
RPM_HASH = "8f9334dfb898ad1ce1b12e93d3c5001af745aec59d306156280fe2e91228c2952d0966b87ded5d0120d79bac7fbc3a622cb33ff339f2a971badcf321cdf799c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-biplist \
python310-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
