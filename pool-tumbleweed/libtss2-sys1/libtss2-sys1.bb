SUMMARY = "TPM2 System API (SAPI)"
DESCRIPTION = "System API (SAPI) as described in the system level API and TPM command \
transmission interface specification. This API is a 1-to-1 mapping of the TPM2 \
commands documented in Part 3 of the TPM2 specification. Additionally there \
are asynchronous versions of each command. These asynchronous variants may be \
useful for integration into event-driven programming environments. Both the \
synchronous and asynchronous API are exposed through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-sys1-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "9bc6d0a909e732902a21ea63501b4d535ce99b437f82beee7a4c95135b9815d1fb53098fdcdd988b9420371238014708cb3f0312a670569e07b862a3cdc63da8"

RPROVIDES:${PN} += "libtss2-sys.so.1()(64bit) \
libtss2-sys1 \
libtss2-sys1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtss2-mu.so.0()(64bit)"

inherit rpm
