SUMMARY = "C++ bindings development files for libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the C++ bindings development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig++-devel-1.7.3-1.9.aarch64.rpm"
RPM_HASH = "a9cb9a211aa20150f18ca1bca755f5524f6ef282ce2c319ac743a8d97ba5140fe512d1783df635785179247ec7f3779c6f9c08faa721ef7a0d4d4ee3b60b929f"

RPROVIDES:${PN} += "libconfig++-devel \
pkgconfig-libconfig++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libconfig++11 \
libconfig-devel"

inherit rpm
