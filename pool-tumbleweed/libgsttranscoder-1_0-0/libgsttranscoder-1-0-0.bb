SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgsttranscoder-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "61f2e448fe7b6bab87ec94aea8c728835ad593c327b828495714d43eae6c11281df993ecda5ea3b3f657525703a068ba873ca4dfeeba347be1a42ea2b5b4d383"

RPROVIDES:${PN} += "libgsttranscoder-1-0-0 \
libgsttranscoder-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
