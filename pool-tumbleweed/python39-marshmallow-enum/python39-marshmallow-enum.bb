SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-marshmallow-enum-1.5.1-2.1.noarch.rpm"
RPM_HASH = "6ee1ee7cedbc6acba656f7a635b1d2a39a221a23f28bb7f29e09c8f83c770924fe11a387f50d21c76867f057c561e474d16b1ca1d11f01a794fd7ac3e02549d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-marshmallow-enum \
python39-marshmallow-enum \
python3dist-marshmallow-enum"

RDEPENDS:${PN} += "python-abi \
python39-marshmallow"

inherit rpm
