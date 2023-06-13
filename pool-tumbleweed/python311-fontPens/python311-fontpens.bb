SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python311-fontPens-0.2.4-5.7.noarch.rpm"
RPM_HASH = "f7a161fa72d6297d73d8f146c31d97a06dbfc61c6dd505b957ba950c9861c647c960be6a02e5b4e72a15967d354cfbb008223c3487ba61accf8b3fa305f5387a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fontpens) \
python311-fontPens \
python3dist(fontpens)"

RDEPENDS:${PN} += "python(abi) \
python311-FontTools"

inherit rpm
