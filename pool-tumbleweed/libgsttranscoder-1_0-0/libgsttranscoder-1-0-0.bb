SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgsttranscoder-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "8a8d53be1d8e04adb4f030545aa626d487b1c204375b207bef1e13926ff05b5e426a59a22fa26302ce6a3daecc170b813d9a00e0c39ae61e3fa765b99822b76a"

RPROVIDES:${PN} += "libgsttranscoder-1.0.so.0()(64bit) \
libgsttranscoder-1_0-0 \
libgsttranscoder-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
