SUMMARY = "TPM2 System API (SAPI)"
DESCRIPTION = "System API (SAPI) as described in the system level API and TPM command \
transmission interface specification. This API is a 1-to-1 mapping of the TPM2 \
commands documented in Part 3 of the TPM2 specification. Additionally there \
are asynchronous versions of each command. These asynchronous variants may be \
useful for integration into event-driven programming environments. Both the \
synchronous and asynchronous API are exposed through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-sys1-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "9dc1f558fae409d88198270cd03f1ab825ded0e357a1188cd8011c842024fc4d33f197d764a51b6bdd2f8a001ca4d807b889c3554f3588c49980fbae2ca18a39"

RPROVIDES:${PN} += "libtss2-sys.so.1 \
libtss2-sys1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
