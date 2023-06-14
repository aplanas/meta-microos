SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb5-2.2.7-111.12.aarch64.rpm"
RPM_HASH = "79e653893213bc1aee16481c55809e6e73944d879752bb2fb464183a18fe9e0782b4f329fec193c666d702e63078f6cb19f0ce6874c3433db6123a482ecf05f4"

RPROVIDES:${PN} += "libnjb.so.5 \
libnjb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnjb \
libusb-0.1.so.4"

inherit rpm
