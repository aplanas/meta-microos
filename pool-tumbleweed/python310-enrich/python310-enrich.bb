SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python310-enrich-1.2.7-3.3.noarch.rpm"
RPM_HASH = "e972202d718dee26dd699061833d69c922a5424851819c85dd85a94ca59fce857229a10dc9a5047d86e1d16bb0ee847b72843ae7c60ef2aaa2d20eca8a9a40cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-enrich \
python310-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.10dist-rich \
python310-rich"

inherit rpm
