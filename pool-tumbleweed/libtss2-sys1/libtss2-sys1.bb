SUMMARY = "TPM2 System API (SAPI)"
DESCRIPTION = "System API (SAPI) as described in the system level API and TPM command \
transmission interface specification. This API is a 1-to-1 mapping of the TPM2 \
commands documented in Part 3 of the TPM2 specification. Additionally there \
are asynchronous versions of each command. These asynchronous variants may be \
useful for integration into event-driven programming environments. Both the \
synchronous and asynchronous API are exposed through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-sys1-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "94972d3d01ff1e257fd8179d5172db1445fe6693d57d5e10160a1f53c4726678dfd940bfde87e0da073a5fd0b27fe884b8d7b83efe59e1774467af99de4c99ac"

RPROVIDES:${PN} += "libtss2-sys.so.1 \
libtss2-sys1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
