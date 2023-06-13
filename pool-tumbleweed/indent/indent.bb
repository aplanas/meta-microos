SUMMARY = "Indentation of Source Code in various styles"
DESCRIPTION = "Indent can be used to make code easier to read. It can also convert \
from one style of writing C code to another. indent understands a \
substantial amount of C syntax, but it also tries to cope with \
incomplete and malformed syntax."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-2.2.13-1.1.aarch64.rpm"
RPM_HASH = "26247ec1e5bd7e8b450805ccfdb9362c9dd8fdf916983f60f42a177c89ed84b7d8b3da808dfb3e480e64050970bc6f578261c3ce37c54ecce5ec831d3b027d42"

RPROVIDES:${PN} += "indent \
indent(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
