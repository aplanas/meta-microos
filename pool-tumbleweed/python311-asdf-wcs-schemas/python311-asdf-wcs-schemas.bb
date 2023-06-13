SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python311-asdf-wcs-schemas-0.1.1-1.7.noarch.rpm"
RPM_HASH = "71d40786f58e41fdd8747c595257594a844fd56ed47e1786993f95dbf3f5adf8a2e91cad95fc921a7ad9a8ab53dc7377a845f10d06f1e5776e8c9a34267547ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-wcs-schemas) \
python311-asdf-wcs-schemas \
python311-asdf_wcs_schemas \
python3dist(asdf-wcs-schemas)"

RDEPENDS:${PN} += "python(abi) \
python311-asdf"

inherit rpm
