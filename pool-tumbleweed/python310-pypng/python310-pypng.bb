SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.0.20"

RPM_NAME = "python310-pypng-0.0.20-6.4.noarch.rpm"
RPM_HASH = "5ac2145203086587fb8d85a487205aca984ec3b850e2ec854b1f01cf9b5fc8d8317af0fa05250e1b84cbfd87585b7a8cbdc390deb834d96c6d6887e9d2b0efd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypng \
python3.10dist-pypng \
python310-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
