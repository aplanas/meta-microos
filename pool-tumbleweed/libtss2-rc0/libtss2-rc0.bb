SUMMARY = "TPM2 error code translation library"
DESCRIPTION = "This library can translate TPM error codes into human readable strings."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-rc0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "85ca178e7c7c3ff7410d5379207d0c015a9e40e0fae2642be3c2bcc293fa203400ab6ec10de4527b65e77a013eeaecc262ead1cc17f5565f4bc947d6a634937a"

RPROVIDES:${PN} += "libtss2-rc.so.0 \
libtss2-rc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
