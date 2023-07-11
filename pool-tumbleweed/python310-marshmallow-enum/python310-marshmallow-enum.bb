SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-marshmallow-enum-1.5.1-2.1.noarch.rpm"
RPM_HASH = "54838786436167d446cbf19ea4d8f3650a066795b064cc0b41021ef466cfcd55a0e79ba9d54fd27b3f90b6450051719bc2f02ebef4138a729f9a6dfbc6cb3a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-marshmallow-enum \
python310-marshmallow-enum \
python3dist-marshmallow-enum"

RDEPENDS:${PN} += "python-abi \
python310-marshmallow"

inherit rpm
