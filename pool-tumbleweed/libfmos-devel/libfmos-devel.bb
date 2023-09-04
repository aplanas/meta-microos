SUMMARY = "Development files for libfmos"
DESCRIPTION = "libfmos is a library for MacOS data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmos."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "libfmos-devel-20230707-2.1.aarch64.rpm"
RPM_HASH = "d907d8de2a053fa070985bfce02cd51cf4a78926d1b92f76dc589cf3cbc4ee72f463fb4deb3b11147bcb5b8256781fe83571a36efa8fc5cdbee6b212289ee265"

RPROVIDES:${PN} += "libfmos-devel \
pkgconfig-libfmos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmos1"

inherit rpm
