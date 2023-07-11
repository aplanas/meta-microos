SUMMARY = "Python3 bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Python3 bindings to access the OpenWSMAN client \
API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "python3-openwsman-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "df2189f53cc4a2a034ad635a8849cbd5f6e9da9e34f87f0fa7a78b0fb2a0094e1692a2401e7213fd4b9d91eb9e134ed25d36e302cdafccab30f94cd5aa55484d"

RPROVIDES:${PN} += "openwsman-python \
python3-openwsman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
python-abi \
python3"

inherit rpm
