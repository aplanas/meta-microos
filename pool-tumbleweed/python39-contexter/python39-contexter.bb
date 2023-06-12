SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-contexter-0.1.4-2.14.noarch.rpm"
RPM_HASH = "281a19f48a47067924077ea7ec49bfd5e75e2724368df7fbd35e6a5427f2969a4d2d4bf6f13dfe177bceaa66c5ffdce3adfc6ef16857094c5d5b411965882fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(contexter) \
python39-contexter \
python3dist(contexter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
