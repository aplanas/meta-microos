SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libuna1-mini-20230710-1.1.aarch64.rpm"
RPM_HASH = "7f6e079311e5ab3e836f5191c5781bf87cee067081f6b552e32b406abbf8c613eb19da2f97dbfd8d3f012317a53b9572a50b28e49d821922fd5b1afbe5ac6f0f"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1-mini"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
