SUMMARY = "Development files for libfmos"
DESCRIPTION = "libfmos is a library for MacOS data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmos."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "libfmos-devel-20220811-2.4.aarch64.rpm"
RPM_HASH = "ea0548b0c59efb140b60255dcc0a12a9b6142f642bbe5e99a98fe5e62891e1df9fc0b57709223af473f014e45355595e97015b946e12f4ab4b97b9956ebc7fec"

RPROVIDES:${PN} += "libfmos-devel \
libfmos-devel(aarch-64) \
pkgconfig(libfmos)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmos1"

inherit rpm
