SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-zopfli-0.2.2-2.1.aarch64.rpm"
RPM_HASH = "a764a02a85e4d84dadd09d63f5d976e3e3fc53fc2642bbb0566e32d807e3835bb4a61d1c346fffce7db41bc22189d50f63b5665e14847d5ee48b44785cf74355"

RPROVIDES:${PN} += "python3-zopfli \
python3.10dist(zopfli) \
python310-zopfli \
python310-zopfli(aarch-64) \
python3dist(zopfli)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzopfli.so.1()(64bit) \
libzopflipng.so.1()(64bit) \
python(abi)"

inherit rpm
