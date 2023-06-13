SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "libpolylibgmp8-5.22.5-1.11.aarch64.rpm"
RPM_HASH = "752a11c644e4bc7f2d7c730bab0cf55196463c350b0ce2abff76e6e89c0450e324a2e811c78aa7c14fb6f700aab9d312931dec63264bdf43ad6231c72a6ad744"

RPROVIDES:${PN} += "libpolylibgmp.so.8()(64bit) \
libpolylibgmp8 \
libpolylibgmp8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
