SUMMARY = "A dynamic library providing KVM-based process isolation capabilities"
DESCRIPTION = " \
libkrun is a dynamic library that allows programs to easily acquire the \
ability to run processes in a partially isolated environment using KVM Virtualization. \
It integrates a VMM (Virtual Machine Monitor, the userspace side of an Hypervisor) with \
the minimum amount of emulated devices required to its purpose, abstracting most of the \
complexity that comes from Virtual Machine management, offering users a simple C API."
LICENSE = "Apache-2.0"

PV = "1.4.10"

RPM_NAME = "libkrun1-1.4.10-1.6.aarch64.rpm"
RPM_HASH = "f2f86599ba5efd76859fdc7ee60ab436a60dd01194aabbab96b117a0e35334908a030e3082f3ee8daf1252b7fd7d7d7874ca5518728eb8a0ef93a528a7064c08"

RPROVIDES:${PN} += "libkrun.so.1 \
libkrun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfdt.so.1 \
libgcc-s.so.1 \
libkrunfw.so.3"

inherit rpm
