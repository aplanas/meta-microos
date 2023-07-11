SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2iso18-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "9c9e61e1334557a55452e623a447897f9c4571a573bb929ab8f4ae2dfe4d1079ccb855696fb86a9f80f1500911d52ab7f74a49beb3cb0c9a3512f8488441672f"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
