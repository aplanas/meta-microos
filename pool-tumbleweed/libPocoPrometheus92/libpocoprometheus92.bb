SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoPrometheus92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "6e8eb7a057493bd5aceb28107278199ad14b3f1be04bc3bd051ff9af754d78237fff006396dcf09b666137f060b542449770754625e912e178054f1a0e79e26d"

RPROVIDES:${PN} += "libPocoPrometheus.so.92 \
libPocoPrometheus92 \
poco-prometheus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
