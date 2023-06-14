SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python310-asdf-wcs-schemas-0.1.1-1.7.noarch.rpm"
RPM_HASH = "d1b2c96d6ce15dd81ecac02e87e1bd500da672644ba781e914bfac0f21adf1ec24034563cb433f1d1ba25a5dc7626831744f5df663a74048899d22a3e8cf3b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-wcs-schemas \
python3.10dist-asdf-wcs-schemas \
python310-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python310-asdf"

inherit rpm
