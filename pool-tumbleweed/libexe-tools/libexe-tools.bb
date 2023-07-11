SUMMARY = "Tools to access Microsoft executable (EXE) format files"
DESCRIPTION = "Tools to access Microsoft executable (.exe) format files \
including PE/COFF formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-tools-20210424-4.9.aarch64.rpm"
RPM_HASH = "4784932e7d71f05cc6fa1cb44700b2fd2863522feda0435fe43ae60523e60a15a84ccade148aceae97dde5aec9499b377ac92e3082cfdf884075cba330731480"

RPROVIDES:${PN} += "libexe-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1"

inherit rpm
