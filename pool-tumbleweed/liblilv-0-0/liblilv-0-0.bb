SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-0-0.24.20-1.1.aarch64.rpm"
RPM_HASH = "249c7a22ba566d0e64f342a23e007a20978f8b847605dceafb482ade6f149894726c0a6f0a08942652c2b7b5ba0819a843f1ef9d06ff18413a077146eedd9b33"

RPROVIDES:${PN} += "liblilv-0-0 \
liblilv-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0-0 \
libserd-0.so.0 \
libsord-0-0 \
libsord-0.so.0 \
libsratom-0.so.0"

inherit rpm
