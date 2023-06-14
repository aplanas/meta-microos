SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-comm-0.1.3-1.1.noarch.rpm"
RPM_HASH = "c0c38019a0b10c05287c9c21e686473e635e0ecfcb79395b7185a1d4b348dd3899d4f6fdbb0607c3d0129026ac6d3b24600e2d3f9055a220019f1206d2852598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comm \
python3.10dist-comm \
python310-comm \
python3dist-comm"

RDEPENDS:${PN} += "python-abi \
python310-traitlets"

inherit rpm
