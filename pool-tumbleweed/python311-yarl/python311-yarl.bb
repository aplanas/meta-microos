SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python311-yarl-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "b1bd8a66259fd55b6dd2aa8729bba75b4c9410d39610770c880e52fb489f06b853ef2b63e469b98d2f1491e8b648d8370afd5c071c6068f26361698c13f159cc"

RPROVIDES:${PN} += "python3.11dist-yarl \
python311-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-idna \
python311-multidict"

inherit rpm
