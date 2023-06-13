SUMMARY = "A library for user-space configuration of the uvcvideo driver"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam0-0.2.5-2.12.aarch64.rpm"
RPM_HASH = "b92fd10f9ad2159bf44d323e11fbe95ef87ce5b61095b164b7b523ed3e7eb5393776944682a7b75f94f35b934120dd0b104b8313ab832c70471fe08df278600e"

RPROVIDES:${PN} += "libwebcam.so.0()(64bit) \
libwebcam0 \
libwebcam0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
