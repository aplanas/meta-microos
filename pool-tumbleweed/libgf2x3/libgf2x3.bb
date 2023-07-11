SUMMARY = "Library for multiplication over the GF(2) field"
DESCRIPTION = "gf2x is a library for multiplication of polynomials over the \
GF(2) binary field."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libgf2x3-1.3.0-2.11.aarch64.rpm"
RPM_HASH = "f9d77a50f14a16d1437ae743bae725c261cea9f6f015ee05cd3adf5987f21c52e55d9d88ada7139be6541a2648e5fe5c4336fa59cabc90d5e973f0a4603500d2"

RPROVIDES:${PN} += "libgf2x-fft.so.3 \
libgf2x.so.3 \
libgf2x3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
