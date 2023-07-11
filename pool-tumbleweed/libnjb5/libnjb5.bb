SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb5-2.2.7-111.13.aarch64.rpm"
RPM_HASH = "0865b003dccb239b198c74b3bb33264d5ab01bd0819f0964db2f8cb4d28efb95b971f69bf01e3564d90074ea0d54ceb7863ee137eef2382f1f07ee2bc98cbc46"

RPROVIDES:${PN} += "libnjb.so.5 \
libnjb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnjb \
libusb-0.1.so.4"

inherit rpm
