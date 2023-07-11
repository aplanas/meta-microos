SUMMARY = "Development files for libcdirectory"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdirectory."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory-devel-20220105-2.6.aarch64.rpm"
RPM_HASH = "a8b64290ba6bc30912869e17941604417f42039d9e1083fffdb6049c8e9b026eace5902e3cae1d8e9d833986d24ba8683c315eb1128ec511222d78bf9d623b7c"

RPROVIDES:${PN} += "libcdirectory-devel \
pkgconfig-libcdirectory"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdirectory1"

inherit rpm
