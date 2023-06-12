SUMMARY = "A dynamic library providing KVM-based process isolation capabilities"
DESCRIPTION = " \
libkrun is a dynamic library that allows programs to easily acquire the \
ability to run processes in a partially isolated environment using KVM Virtualization. \
It integrates a VMM (Virtual Machine Monitor, the userspace side of an Hypervisor) with \
the minimum amount of emulated devices required to its purpose, abstracting most of the \
complexity that comes from Virtual Machine management, offering users a simple C API."
LICENSE = "Apache-2.0"

PV = "1.4.10"

RPM_NAME = "libkrun1-1.4.10-1.4.aarch64.rpm"
RPM_HASH = "602bb8685560959af304e4acad2dc8b840fa442469fad612ae103d3031870d9a4159437239a54f29f405b8a696ef0576a42b38118f540f76b77e13db38b84fa6"

RPROVIDES:${PN} += "libkrun.so.1()(64bit) \
libkrun1 \
libkrun1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libfdt.so.1()(64bit) \
libfdt.so.1(LIBFDT_1.2)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libkrunfw.so.3()(64bit)"

inherit rpm
