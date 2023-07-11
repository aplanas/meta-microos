SUMMARY = "Header files and libraries for libkrun development"
DESCRIPTION = " \
libkrun is a dynamic library that allows programs to easily acquire the \
ability to run processes in a partially isolated environment using KVM Virtualization. \
It integrates a VMM (Virtual Machine Monitor, the userspace side of an Hypervisor) with \
the minimum amount of emulated devices required to its purpose, abstracting most of the \
complexity that comes from Virtual Machine management, offering users a simple C API. \
 \
This package containes the libraries and headers needed to develop programs \
that use libkrun Virtualization-based process isolation capabilities."
LICENSE = "Apache-2.0"

PV = "1.4.10"

RPM_NAME = "libkrun-devel-1.4.10-1.6.aarch64.rpm"
RPM_HASH = "a0ad2d2e486320bc6f7744757ae4ae0a12170eae2965e0afa5060f852dbd89ac198453d9d7b4403a8fc0171798dceb67210957dec7d7099674ebb9f9b24344cb"

RPROVIDES:${PN} += "libkrun-devel"

RDEPENDS:${PN} += "libkrun1"

inherit rpm
