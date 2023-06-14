SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python39-asdf-wcs-schemas-0.1.1-1.7.noarch.rpm"
RPM_HASH = "4cf6f24ba03a0d4669bb0860eab02234dd90572499583827706d7e564e49c200194a19b5624f08643607b35846f4d9486d7f08323777128102de5f5b5e286bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-wcs-schemas \
python39-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python39-asdf"

inherit rpm
