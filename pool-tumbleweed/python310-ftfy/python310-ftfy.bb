SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python310-ftfy-6.0.3-1.9.noarch.rpm"
RPM_HASH = "7eb8d9db7e468f3a7e2f3b7402c57f5a533061b83383437114a830cf317b090497d1b5535c5e8530c0267c19ae82bb9d23914d4d58e913cf4c965fd8e1f8aac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ftfy \
python310-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-wcwidth \
update-alternatives"

inherit rpm
