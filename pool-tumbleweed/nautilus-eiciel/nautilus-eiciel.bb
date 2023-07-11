SUMMARY = "Nautilus ACL viewer and editor extension"
DESCRIPTION = "A Nautilus extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0"

RPM_NAME = "nautilus-eiciel-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "7603f2ce9076652bebfec25837e9e38c3820d1df6c6474538ffeb12a7453a5d97bd8db9f24c572ae0de2312a624699155ce659681badb06ed06206610eaada4a"

RPROVIDES:${PN} += "libeiciel-nautilus.so \
nautilus-eiciel"

RDEPENDS:${PN} += "eiciel \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libstdc++.so.6"

inherit rpm
