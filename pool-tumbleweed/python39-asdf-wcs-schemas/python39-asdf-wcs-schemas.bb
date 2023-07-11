SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python39-asdf-wcs-schemas-0.1.1-1.9.noarch.rpm"
RPM_HASH = "e531722092ed2041b32a72b014233303a9ff2f687a37954e5bf9ad7c05ffecfde13b03e7e74735904b2efd8eea4ad2cdbd89fda08cba2f967950158a7099c4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-wcs-schemas \
python39-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python39-asdf"

inherit rpm
