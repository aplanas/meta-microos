SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid1-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "7b60a624d8c0489dbc6bb474bc7a9ee14c0b296d88c0db647d67751f84afab6f5a40938b64b62489a6c58245bc34890fae4cf859368601399570e6610d559e54"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
