SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python310-yarl-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "da34932f1514d59b986b4383c50aa36100b5eac973f35a001411cf8e8a3560eb74b7267c32c637d0787d97080628f24090186b02d8316d7700979f55dff92da9"

RPROVIDES:${PN} += "python3-yarl \
python3.10dist(yarl) \
python310-yarl \
python310-yarl(aarch-64) \
python3dist(yarl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-idna \
python310-multidict"

inherit rpm
