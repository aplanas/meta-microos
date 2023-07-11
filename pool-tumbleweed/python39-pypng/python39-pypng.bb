SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.20220715.0"

RPM_NAME = "python39-pypng-0.20220715.0-1.1.noarch.rpm"
RPM_HASH = "40a11293996a3be250892092d118328a307d40fda2908d56e7951e692bb53412ff29b8189f03e2e129ddc98624c31ee8c78846629358192991b62f81410c9122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypng \
python39-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
