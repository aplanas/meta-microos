SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-libs-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "ec3becdc3aca9f7c914c3f46305e5feb2f62bdd7f27367df16203f726b29b622de5cbac6e6c0d4b6234f8a8cb5541c54eb33ea2094f75a684c0ac70c41080802"

RPROVIDES:${PN} += "dapl-debug-libs \
dapl2 \
libdat2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dapl-debug \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
