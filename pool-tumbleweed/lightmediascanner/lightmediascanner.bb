SUMMARY = "Lightweight media scanner"
DESCRIPTION = "Lightweight media scanner meant to be used in not-so-powerful devices, \
like embedded systems or old machines."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "lightmediascanner-0.5.2-2.4.aarch64.rpm"
RPM_HASH = "e55c0af347cd813ca32b62fc222a13680fae23c271bbae91e5a08f59d717ef2522e52e1be1edc26ded0d3a4764ddc19ec855ad220bd3ced646a7919ff33efd38"

RPROVIDES:${PN} += "lightmediascanner \
lightmediascanner(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblightmediascanner.so.0()(64bit) \
libogg.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libvorbis.so.0()(64bit)"

inherit rpm
