SUMMARY = "A library for user-space configuration of the uvcvideo driver"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam0-0.2.5-2.13.aarch64.rpm"
RPM_HASH = "91cfcf4aea9ebb6215cdd997879bddde0c2322b8dd7cd0d5f44359b406ee5d2274782bec5f853f8189065f030fcbc0c0e5b1b1087440b75eb1e5c4e2240a93a9"

RPROVIDES:${PN} += "libwebcam.so.0 \
libwebcam0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
