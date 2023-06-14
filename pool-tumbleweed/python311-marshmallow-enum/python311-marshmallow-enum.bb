SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-marshmallow-enum-1.5.1-1.10.noarch.rpm"
RPM_HASH = "cbf71f74984ccd022fe8abe8c02292c1a50d42f599ada65ac4af0c61112966ecf4fa6fd3860478ea8375e66049edb42f24969c1f89273c18aaf9eeadd4208257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-marshmallow-enum \
python311-marshmallow-enum \
python3dist-marshmallow-enum"

RDEPENDS:${PN} += "python-abi \
python311-marshmallow"

inherit rpm
