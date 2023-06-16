SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-pywal-3.3.0-1.13.noarch.rpm"
RPM_HASH = "d588adab43b7aa03f4a682dc73e2f91cbf8e5e4e22d62194488cdfeb9b8bcac72ea97ceb5f1b3841fcb0ca3165aa81d0e8fac322d0ece3486ba9779d34788d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywal \
python3.10dist-pywal \
python310-pywal \
python3dist-pywal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
