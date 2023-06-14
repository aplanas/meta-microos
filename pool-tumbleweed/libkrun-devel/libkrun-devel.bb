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

RPM_NAME = "libkrun-devel-1.4.10-1.4.aarch64.rpm"
RPM_HASH = "9878bcee09dc578ff83394656820229e2396ba7e64cd1bec434d874536f85869c98074fae344f7f426ff7f14337234205ca1969ff19f7ad03fa06d5c6c1e77c4"

RPROVIDES:${PN} += "libkrun-devel"

RDEPENDS:${PN} += "libkrun1"

inherit rpm
