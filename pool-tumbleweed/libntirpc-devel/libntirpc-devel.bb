SUMMARY = "Copy of TIRPC headers from NFS-Ganesha"
DESCRIPTION = "This package contains the libraries and headers needed to develop programs \
using NFS-Ganesha transport-independent RPC (TI-RPC)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "libntirpc-devel-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "664234ac451ef6c5a60aadc730079ec85908324c01d40e0d7d0bc8fd76a38d47e6a98b99962185ceb44c7ff3edaed2e14c30fad4894a8229abf3898cba8559d8"

RPROVIDES:${PN} += "libntirpc-devel \
libntirpc-devel(aarch-64) \
pkgconfig(libntirpc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntirpc3_3"

inherit rpm
