SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-multipledispatch-0.6.0-2.11.noarch.rpm"
RPM_HASH = "adaac6dc89765cea68a246540d207702047283138dcc7247e9dc5be45bb04aebf38c4c42f1eea4652b533000fdafaf29b890dbd4c25728235c51b4dedf2f2bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-multipledispatch \
python310-multipledispatch \
python3dist-multipledispatch"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
