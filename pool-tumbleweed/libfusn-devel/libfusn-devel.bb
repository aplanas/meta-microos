SUMMARY = "Development files for libfusn"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfusn."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn-devel-20220119-4.2.aarch64.rpm"
RPM_HASH = "16534ebfbd88d836f474f9dc5f317f57f5421090c3845f442e39f33ac108194132c368d04f177edb164495d0825d231d299f045eca9e59993fe6e22c77bf8940"

RPROVIDES:${PN} += "libfusn-devel \
libfusn-devel(aarch-64) \
pkgconfig(libfusn)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfusn1"

inherit rpm
