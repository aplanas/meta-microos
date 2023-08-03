SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsttranscoder-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "f36e547428e0f32fbc12ed3ed9cb7b2ba59c5280a01cfe11fe477d7d946c37c9823fdeb185f1598b33c72996fe246ad002554057e5403e6ad92dadaa58c54521"

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
