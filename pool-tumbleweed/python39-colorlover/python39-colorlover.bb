SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-colorlover-0.3.0-1.14.noarch.rpm"
RPM_HASH = "a0918820aa4882eb2970636635081245a5e737d4da7055d2f768f65d745629235a4692efb91bc85643f89c2a4b6f675ba133f49f26b4823da1e636f57cfa50c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(colorlover) \
python39-colorlover \
python3dist(colorlover)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
