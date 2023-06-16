SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.0.20"

RPM_NAME = "python311-pypng-0.0.20-6.4.noarch.rpm"
RPM_HASH = "e99bc578e7b1e08c91d3044b3b42eeeab26f9d82ec8831ee0b14da2fe0d46d562dccb3b12d42d41a363d0bf26fc9944c14de6ae2df08856af6fa0c85ae42072c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pypng \
python311-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
