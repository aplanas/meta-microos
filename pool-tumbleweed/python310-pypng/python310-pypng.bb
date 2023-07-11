SUMMARY = "Pure Python PNG image encoder/decoder"
DESCRIPTION = "PyPNG allows PNG image files to be read and written using pure Python."
LICENSE = "MIT"

PV = "0.20220715.0"

RPM_NAME = "python310-pypng-0.20220715.0-1.1.noarch.rpm"
RPM_HASH = "6b8a9db0a52c712684ac45a21ced5a087fc47f316ed179ebd77869e2e17f782dd3437e385d886573048dd438f2b27f00f0cfd984a320984a3ac4f5bcde1e4292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypng \
python310-pypng \
python3dist-pypng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
