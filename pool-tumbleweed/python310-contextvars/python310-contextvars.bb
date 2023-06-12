SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python310-contextvars-2.4-4.1.noarch.rpm"
RPM_HASH = "e71f9ea38aee9ec4ce72a37f7032f5e097090eee003979f0be5bb3d24f1a73b8cfaf3164fe6558af3f8ecd9238bfb24f65eab4ff9a10c2f749c59ac2fea77a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contextvars \
python3.10dist(contextvars) \
python310-contextvars \
python3dist(contextvars)"
RDEPENDS:${PN} += "python(abi) \
python310-immutables"

inherit rpm
