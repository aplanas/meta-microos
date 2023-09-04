SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-flit-3.8.0-6.1.noarch.rpm"
RPM_HASH = "3535ec481ad517ec0cfeac86adc958eba25229957bae33cb04a070004624231456be18449d0c00c13ae34dccaa0825d08d4efaeb3ec1bfb23d5dbdd10f8d9cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit \
python3.11dist-flit \
python311-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-flit-core \
python311-requests \
python311-tomli-w \
update-alternatives"

inherit rpm
