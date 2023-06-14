SUMMARY = "Development files for libfwnt"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwnt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt-devel-20220922-2.5.aarch64.rpm"
RPM_HASH = "5d1b05cd147ff4f1baf6c06b2e91b55aac0045b0fa0020aff69bff3c89bcfc60c1f58ba8aaec67c4dc70ab0a3aeb0feb0b25abf65390d21409d5b8390bdf9c85"

RPROVIDES:${PN} += "libfwnt-devel \
pkgconfig-libfwnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwnt1"

inherit rpm
