SUMMARY = "Lightweight media scanner"
DESCRIPTION = "Lightweight media scanner meant to be used in not-so-powerful devices, \
like embedded systems or old machines."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "lightmediascanner-0.5.2-2.4.aarch64.rpm"
RPM_HASH = "e55c0af347cd813ca32b62fc222a13680fae23c271bbae91e5a08f59d717ef2522e52e1be1edc26ded0d3a4764ddc19ec855ad220bd3ced646a7919ff33efd38"

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
