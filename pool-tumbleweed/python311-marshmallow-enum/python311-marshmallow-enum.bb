SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-marshmallow-enum-1.5.1-2.1.noarch.rpm"
RPM_HASH = "6c9e419c4f4f3fe059af79904b61f68a7925f4b4e87e456057d2fff5ada1cfbfdec41f2f35fbabb43f3cf1b60de644ae48b71cbaa211d0f89663853ace68e15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow-enum \
python3.11dist-marshmallow-enum \
python311-marshmallow-enum \
python3dist-marshmallow-enum"

RDEPENDS:${PN} += "python-abi \
python311-marshmallow"

inherit rpm
