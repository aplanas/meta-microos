SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-multipledispatch-0.6.0-2.9.noarch.rpm"
RPM_HASH = "9ab11930182a6e4eba3311374063c0b3f4bc865aadae8d8df17de6982304ab8848483d16205bb9ec71a40b60682a50a679f1fd737e8065ef49c520e65ec701a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(multipledispatch) \
python39-multipledispatch \
python3dist(multipledispatch)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
