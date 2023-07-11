SUMMARY = "Locale and ISO 2022 support for Unicode terminals"
DESCRIPTION = "Luit is a filter that can be run between an arbitrary application and a \
UTF-8 terminal emulator. It will convert application output from the \
locale's encoding into UTF-8, and convert terminal input from UTF-8 into \
the locale's encoding."
LICENSE = "MIT"

PV = "20221028"

RPM_NAME = "luit-20221028-1.3.aarch64.rpm"
RPM_HASH = "529c1bfccc40688b9362870d4ae1259bf86080997e9983b138eb2922540367dcdc264ac91afab1956e1f7d743ede9835edb713ad9f6c01c027abb6d1d6867e6b"

RPROVIDES:${PN} += "luit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
