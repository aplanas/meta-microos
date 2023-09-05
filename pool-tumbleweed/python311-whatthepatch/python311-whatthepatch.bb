SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-whatthepatch-1.0.5-1.1.noarch.rpm"
RPM_HASH = "40cdc7a4f8b340f7614936c4e3770e0cc58b029dbc7519a65a16aba73c971253f258f1fd00e0595db9b58276f7537066277dd854e66023d1743f1dd67623ac08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatthepatch \
python3.11dist-whatthepatch \
python311-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
