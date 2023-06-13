SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python311-xxhash-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "e908d52389015c3181a39c80ffd2d45a5402bc2152dc01e8085f2a36a143818924c24620fd0215fdc9916f2113704b87c07a8a09e8d0468c54bfcb10b3e98560"

RPROVIDES:${PN} += "python3.11dist(xxhash) \
python311-xxhash \
python311-xxhash(aarch-64) \
python3dist(xxhash)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxxhash.so.0()(64bit) \
python(abi)"

inherit rpm
