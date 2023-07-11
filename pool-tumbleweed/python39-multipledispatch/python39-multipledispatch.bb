SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-multipledispatch-0.6.0-2.11.noarch.rpm"
RPM_HASH = "67a00542c05de698c2e0ca2d7317eef0abc75e14384d270572bf376dfd82b3d262680dc44710923df61b3f003edd0354e5fb71c1400ef02fbf84519380c929fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-multipledispatch \
python39-multipledispatch \
python3dist-multipledispatch"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
