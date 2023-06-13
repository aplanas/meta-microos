SUMMARY = "Development files for libqb"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6+20220323.758044b"

RPM_NAME = "libqb-devel-2.0.6+20220323.758044b-1.3.aarch64.rpm"
RPM_HASH = "73f677ff10a87282159109a7e56209e7ae6343417033968d8517fd6145fc07a15839f8b491cd9a4b6ed77f8356d254d8d2d8eb4d0a892e5b6a3a85cf81d6a156"

RPROVIDES:${PN} += "libqb-devel \
libqb-devel(aarch-64) \
pkgconfig(libqb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqb100"

inherit rpm
