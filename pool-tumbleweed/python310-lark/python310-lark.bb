SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python310-lark-1.1.5-2.1.noarch.rpm"
RPM_HASH = "3bfcc4b78146c4e5e400a99b4925bb87f2d4965980fa69f9515277b1d2cdb541dd277b7a898bd77f092b03ab42c10fd01ec94a03423a966b826be04b7f5bafff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lark \
python3-lark-parser \
python3.10dist(lark) \
python310-lark \
python310-lark-parser \
python3dist(lark)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
