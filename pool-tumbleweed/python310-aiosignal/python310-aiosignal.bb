SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-aiosignal-1.3.1-1.1.noarch.rpm"
RPM_HASH = "fde6dae1ba4f4facb91442eabdadf36891800c74dfe6502f05db9bb7e9604f28ce1684d6df828108b9f6a735b96ce70f6f090dd37937953498d3919d54000331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosignal \
python3.10dist(aiosignal) \
python310-aiosignal \
python3dist(aiosignal)"

RDEPENDS:${PN} += "python(abi) \
python310-frozenlist"

inherit rpm
