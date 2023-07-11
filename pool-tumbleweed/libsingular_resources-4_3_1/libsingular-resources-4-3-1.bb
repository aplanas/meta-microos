SUMMARY = "Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libsingular_resources-4_3_1-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "926150a2b75d4fc2b81603db955ac2696a57ea2e8dd09543e2d7e8099126d32ead2e05d8924d7beb53f4616a272429d8dd3bcd6d3e0137f65ef92c7b2516bb38"

RPROVIDES:${PN} += "libsingular-resources-4-3-1 \
libsingular-resources-4.3.1.p3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
