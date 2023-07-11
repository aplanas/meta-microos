SUMMARY = "Shared library for fastjet-contrib"
DESCRIPTION = "This package provides the shared library for fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "libfastjetcontribfragile-1.049-1.4.aarch64.rpm"
RPM_HASH = "24d1f64dea14e761ea8c64f885d099f6849748db2c76481aef8ad9fe990eba52daf02c7aaf44edfe998e1f96e03ddea47ef5e113cfd3a205cc6586bb4e6ada5e"

RPROVIDES:${PN} += "libfastjetcontribfragile \
libfastjetcontribfragile.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
