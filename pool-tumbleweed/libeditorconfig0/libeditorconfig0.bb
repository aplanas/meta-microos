SUMMARY = "EditorConfig core library written in C"
DESCRIPTION = " \
EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains shared library."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.6"

RPM_NAME = "libeditorconfig0-0.12.6-1.1.aarch64.rpm"
RPM_HASH = "8e18cc5a92bb285eca8bc086178195c166339d8acacde9ebf78a4f95135f4d29b8a7835d536c8468c64534f8fc4c69916e666a6edd13156d481122929ab0505c"

RPROVIDES:${PN} += "libeditorconfig.so.0 \
libeditorconfig0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
