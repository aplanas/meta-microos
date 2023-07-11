SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python310-asdf-wcs-schemas-0.1.1-1.9.noarch.rpm"
RPM_HASH = "972431ec0e1a293f43f6af16e46b1f510c15837887a25128d6425f249606b139bf37ac04b46312c0ef5ee30f4cc6a98352139d4142a82d8fc8cc4575ad8e86fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-wcs-schemas \
python310-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python310-asdf"

inherit rpm
