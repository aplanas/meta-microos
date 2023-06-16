SUMMARY = "Headers and libraries for writing cluster managers"
DESCRIPTION = "Headers and shared libraries for a useful for writing cluster managers \
such as Pacemaker."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-devel-1.0.12+v1.git.1663933145.1619d044-1.4.aarch64.rpm"
RPM_HASH = "25235ef7fa4e050ced782f709683a45ccbcfa0cf850dc6fa507c8f1bd00f255b5c537c45f7e7b97c213dd56e9e86acb0ee76f0f328fabf4adf2b97e5d3dbe257"

RPROVIDES:${PN} += "cluster-glue-devel \
libglue-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cluster-glue-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpils.so.2 \
libplumb.so.2 \
libstonith.so.1"

inherit rpm
