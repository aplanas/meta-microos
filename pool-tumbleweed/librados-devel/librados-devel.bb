SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librados-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "7f9afeb83e41281be272f05d97272c9216b349ecba2c4c2ad8681ff7efca1634f7f7531a7292c0146fe480342bb14e998e2c713457f5b32b659fb5c9f5f1db83"

RPROVIDES:${PN} += "librados-devel \
librados2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
