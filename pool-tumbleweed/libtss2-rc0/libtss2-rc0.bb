SUMMARY = "TPM2 error code translation library"
DESCRIPTION = "This library can translate TPM error codes into human readable strings."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-rc0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "3aa55977c0fe4d41b1f8ddd03a8418ca49418ada64d8a533ebccfabd13d6c2a33af223223c85a86613adfd709b76d7a03c204f6c1c6df200c40152e48f9ee00e"

RPROVIDES:${PN} += "libtss2-rc.so.0 \
libtss2-rc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
