SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-biplist-1.0.3-4.10.noarch.rpm"
RPM_HASH = "15ba4f5dd1efa41cb24836d467b33019d1daa93128bee7a6d822512a99e072302b7e7e8e8e9cd057cf8037140c33f4d28d70252a38b3e2725850dc281bfd5701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-biplist \
python39-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
