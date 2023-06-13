SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python39-lark-1.1.5-2.1.noarch.rpm"
RPM_HASH = "dfe2a6d462d410711d482359a0e3e0058874c09e39644e4b5bb6f2abd7c614315236907fd39ff69375cf9e756c3ab17d986950d06f0964f284c88f6e8f35be83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lark) \
python39-lark \
python39-lark-parser \
python3dist(lark)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
