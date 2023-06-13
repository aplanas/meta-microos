SUMMARY = "Run Time Type Reflection for C++"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "librttr_core0_9_6-0.9.6-4.16.aarch64.rpm"
RPM_HASH = "cdec2cb773a314136c44a7bb2c78d3ace5d2f07c4424607f5defb8d9cd5feb8968fafd3730e009811ef07de286ae2e671f8db6b8571c8e371686b9a2da0a07b1"

RPROVIDES:${PN} += "librttr_core.so.0.9.6()(64bit) \
librttr_core0_9_6 \
librttr_core0_9_6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
