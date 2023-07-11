SUMMARY = "The Tilde Toolkit's library for reading and writing configuration files"
DESCRIPTION = "The libt3config library provides functions for reading and writing \
simple structured configuration files."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "libt3config0-1.0.0-1.15.aarch64.rpm"
RPM_HASH = "f1c940b48a7bdcec11cabd91073d915d594fdcb4857e905fc847674ff61c6f33f22dd5972f3ca7d086f7f273aef3b9b557b696fbefac5faf5d387d8f58bb5e88"

RPROVIDES:${PN} += "libt3config.so.0 \
libt3config0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
