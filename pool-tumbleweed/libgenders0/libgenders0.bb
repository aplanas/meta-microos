SUMMARY = "C library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgenders0-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "52eb5cd16e4a37e45eface13f9ebb70c3308dd0b70dff8d8c8e9fbeb12dd4494c646364617cf6a845f45e40f61e1a785c38a5cedd7f7a95040aa2c169f785bee"

RPROVIDES:${PN} += "libgenders.so.0 \
libgenders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
