SUMMARY = "xSGE Lighting Library"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides an interface for lighting."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-xsge_lighting-1.0.2-1.8.noarch.rpm"
RPM_HASH = "e23c132ce6fbe9fdb6713bac113c24bdb6d697c670305aaeab6721442b3fefa94c6eae80873805961290b174699c3f4c5631fc466211d213924cf71bb741eaf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-lighting \
python310-xsge-lighting \
python3dist-xsge-lighting"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-six"

inherit rpm
