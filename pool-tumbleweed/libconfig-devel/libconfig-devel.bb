SUMMARY = "C bindings development files for libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the C bindings development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig-devel-1.7.3-1.9.aarch64.rpm"
RPM_HASH = "de0efe58404c4762a03924fae64c1a5786633fc70876789aee37eda1d58e5a51431e1bb27f6d959ff9aaef1d45dfd3d5fc77b70f514364b41f04af6a9981552b"

RPROVIDES:${PN} += "libconfig-devel \
pkgconfig-libconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfig11"

inherit rpm
