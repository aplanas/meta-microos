SUMMARY = "Utilities for Persistent Memory"
DESCRIPTION = "The Persistent Memory Development Kit (PMDK) is a collection of \
libraries and tools built on the DAX (Direct Access) feature of the \
Linux kernel which allows applications to access persistent memory as \
memory-mapped files, as described in the SNIA NVM Programming Model. \
 \
* pmempool: utility for administration and diagnosis  of PMDK pools \
* pmreorder: Python scripts to parse and replay operations logged by pmemcheck \
* daxio: utility to perform I/O on DAX devices"
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-tools-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "c65ae59697d0b3d8c856b050d8e45c4444ca8fe41a040adb543eb33db6f2006b134763b60e558ad1dbf38d052b6d4a09495b041181ee9de566a565c07405b991"

RPROVIDES:${PN} += "nvml-tools \
pmdk-tools \
pmdk-tools(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
bash-completion \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_1)(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libdaxctl.so.1(LIBDAXCTL_4)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit) \
libpmem.so.1()(64bit) \
libpmemblk.so.1()(64bit) \
libpmemlog.so.1()(64bit) \
libpmemobj.so.1()(64bit) \
libpmempool.so.1()(64bit)"

inherit rpm
