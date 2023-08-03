SUMMARY = "TPM2 error code translation library"
DESCRIPTION = "This library can translate TPM error codes into human readable strings."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-rc0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "a88bc4c3ff78591e4d24bc1d5e7d781772d889245f7e761ee7be17fb7d69f5ae736f8f19e9d33581afea7f5933307c396a6942aea44be48a40355abd8143bef5"

RPROVIDES:${PN} += "libtss2-rc.so.0 \
libtss2-rc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
