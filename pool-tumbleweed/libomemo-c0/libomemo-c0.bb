SUMMARY = "Omemo C Library"
DESCRIPTION = "The libomemo-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libomemo-c0-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "0519ddf2c7781799bb823b2e4f6ef6c9afa5327e5f144cb309c5229fe4f3fa1682ec69c6098772613767fb43f890225a0ab33981a54c24d656564d9386a159ea"

RPROVIDES:${PN} += "libomemo-c.so.0 \
libomemo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
