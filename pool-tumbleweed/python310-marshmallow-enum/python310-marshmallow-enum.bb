SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-marshmallow-enum-1.5.1-1.10.noarch.rpm"
RPM_HASH = "9e1686e710c29d89910caa44409a3f7e9871a18d30e442b0ec2d1a5cb2f9bf4a9ffdc5b4ed93231df6727d9a3b5f7c97a4cd76d9a0a5ec2db1160a785f05ef6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow-enum \
python3.10dist(marshmallow-enum) \
python310-marshmallow-enum \
python3dist(marshmallow-enum)"

RDEPENDS:${PN} += "python(abi) \
python310-marshmallow"

inherit rpm
