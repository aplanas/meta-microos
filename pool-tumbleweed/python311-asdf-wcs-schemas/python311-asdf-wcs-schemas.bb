SUMMARY = "ASDF WCS Schemas"
DESCRIPTION = "provides ASDF schemas for validating WCS tags. \
Users should not need to install this directly; \
instead, install an implementation package such \
as gwcs, which includes asdf-wcs-schemas as a \
dependency."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python311-asdf-wcs-schemas-0.1.1-1.9.noarch.rpm"
RPM_HASH = "4f0d094cb4828e4c00190a59534c93bc1b7357f2c1d5abfcc3117dbebd1a5085ed3546dfb026a2704ea3d47700fb43e26b735bc39713667869afc12076e70111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-wcs-schemas \
python3.11dist-asdf-wcs-schemas \
python311-asdf-wcs-schemas \
python3dist-asdf-wcs-schemas"

RDEPENDS:${PN} += "python-abi \
python311-asdf"

inherit rpm
