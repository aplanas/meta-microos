SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "93882dd4d309648893c7b790440ba5eb3c76da4d9a9cb8cecd9f18025dde66e12d3df24b166091934f5a7003cf68c7b0dace28c62ddab6c9d0c9d57bc187d747"

RPROVIDES:${PN} += "cross-hppa-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
