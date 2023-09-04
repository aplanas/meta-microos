SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librados-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "817bc3711b5b608700be12ab21b6d5d8c4428326d75a105a4293e7b650fc02722a31f480413c60a8b65651435a165c0daff62777090c188e756e97647b56aa00"

RPROVIDES:${PN} += "librados-devel \
librados2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
