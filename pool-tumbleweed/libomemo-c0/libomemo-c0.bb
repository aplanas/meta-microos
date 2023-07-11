SUMMARY = "Omemo C Library"
DESCRIPTION = "The libomemo-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libomemo-c0-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "5c2d3f1985e2b13cc178b5c807b0ab16e86bb4ad942187b01c27950bd83e26f4f0b96af0c9d9d838b95e3d2322c356d377706922932c254b5764178976943df4"

RPROVIDES:${PN} += "libomemo-c.so.0 \
libomemo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
