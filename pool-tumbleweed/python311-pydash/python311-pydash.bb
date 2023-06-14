SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-pydash-5.1.0-1.6.noarch.rpm"
RPM_HASH = "a4ee6f61ac188c777c671ecd72772a4ecbe91c22060675080d87033da586cd9b0e297faf988ff61e557a79bfb0ef8a162556a2cec98f05b13b2d61652fc052fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydash \
python311-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
