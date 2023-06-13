SUMMARY = "Bare metal interaction APIs"
DESCRIPTION = "Libmetal provides common user APIs to access devices, handle device interrupts \
and request memory across the following operating environments: \
  * Linux user space (based on UIO and VFIO support in the kernel) \
  * RTOS (with and without virtual memory) \
  * Bare-metal environments"
LICENSE = "BSD-3-Clause"

PV = "2020.10.0"

RPM_NAME = "libmetal0-2020.10.0-1.3.aarch64.rpm"
RPM_HASH = "f3d9ce105314985d75a0dda977709855d88008fcb74a38510607e0deadbaeeca8e0800287ac53386713318e9357523e0343baef062ada23170a83e8e56cb6356"

RPROVIDES:${PN} += "libmetal \
libmetal.so.0()(64bit) \
libmetal0 \
libmetal0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhugetlbfs.so()(64bit) \
libsysfs.so.2()(64bit)"

inherit rpm
