SUMMARY = "Headers and libraries for writing cluster managers"
DESCRIPTION = "Headers and shared libraries for a useful for writing cluster managers \
such as Pacemaker."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-devel-1.0.12+v1.git.1663933145.1619d044-1.5.aarch64.rpm"
RPM_HASH = "f7cc3e9ece208b567568938ca9a94dd96bf7a9fca0c7a9105ef15bc1c1b5bdc8309827206887c811f9cb1e849d7b974942677369b0f90299c90c5d71c833c9a0"

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
