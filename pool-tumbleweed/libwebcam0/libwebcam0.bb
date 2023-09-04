SUMMARY = "A library for user-space configuration of the uvcvideo driver"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam0-0.2.5-3.1.aarch64.rpm"
RPM_HASH = "407755e2051f67edd92af9798a07fa4fe48ab58154e1609a790618d29ead8c327275fc64e00ed56e041004c0764b36c3959bccff9ebb8e343617384ab7eae704"

RPROVIDES:${PN} += "libwebcam.so.0 \
libwebcam0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
