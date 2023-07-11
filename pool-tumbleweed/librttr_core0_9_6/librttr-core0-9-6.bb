SUMMARY = "Run Time Type Reflection for C++"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "librttr_core0_9_6-0.9.6-4.17.aarch64.rpm"
RPM_HASH = "67860ae30af6ae62c05fd20f25dc5d3c50014e7bdfec406a893e6b9ec700208a321970cb9bcd52b6d90af364eca96cfe7aee4940ed3143bff42add771f017a97"

RPROVIDES:${PN} += "librttr-core.so.0.9.6 \
librttr-core0-9-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
