SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python311-wadllib-1.3.6-1.10.noarch.rpm"
RPM_HASH = "d9dccba9d61cd4c7fe3d643616af39e11b344da9571c8c941b2a01cf0b28b8945572b758f003862fd270d2478888631319067fb04f8a684bdefe53f75bcbd5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wadllib \
python3.11dist-wadllib \
python311-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python311-lazr.uri"

inherit rpm
