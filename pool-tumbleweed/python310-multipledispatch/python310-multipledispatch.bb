SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-multipledispatch-0.6.0-2.9.noarch.rpm"
RPM_HASH = "cc0504e6edba28fd8108da9e1cbb3164bbeca8a8140d3bed42a7b3691535fbe93f9260cd80041a9ba10e8bfaa64c9f516b57971ceb9484fc0db8c78f7728df5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multipledispatch \
python3.10dist(multipledispatch) \
python310-multipledispatch \
python3dist(multipledispatch)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
