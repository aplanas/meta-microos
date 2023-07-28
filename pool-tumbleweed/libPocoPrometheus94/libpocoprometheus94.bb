SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoPrometheus94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "53123f97349cd1bf85a505a8a07060c207394acf8a575070f7afe1074c5ee6bea86267537325e07664dc06456f5dacb1ad58d332499a1e86bc8ed22dd6d141fd"

RPROVIDES:${PN} += "libPocoPrometheus.so.94 \
libPocoPrometheus94 \
poco-prometheus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoNet.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
