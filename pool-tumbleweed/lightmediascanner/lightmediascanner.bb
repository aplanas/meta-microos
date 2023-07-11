SUMMARY = "Lightweight media scanner"
DESCRIPTION = "Lightweight media scanner meant to be used in not-so-powerful devices, \
like embedded systems or old machines."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "lightmediascanner-0.5.2-2.5.aarch64.rpm"
RPM_HASH = "51e74cc8cc1f10ec101739ef0edb6bd3caf1308c7aa242d3d4affad4ed0acdb568ec922265ae5dbd85c2ae043e7e8281727ae80ab515890adfc25ce70e6f28d1"

RPROVIDES:${PN} += "lightmediascanner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblightmediascanner.so.0 \
libogg.so.0 \
libsqlite3.so.0 \
libtheoradec.so.1 \
libvorbis.so.0"

inherit rpm
