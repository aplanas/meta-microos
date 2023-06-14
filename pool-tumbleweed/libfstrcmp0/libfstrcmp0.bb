SUMMARY = "Fuzzy string compare"
DESCRIPTION = "A library for fuzzy comparisons of strings and byte arrays."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "libfstrcmp0-0.7.D001-1.15.aarch64.rpm"
RPM_HASH = "d6cc50666ff50e36735968447e27b673f5833eb3a50552b7c332e2d70e34990a8a818c606653116e5c84411a9233f3307fad724f902b0d7ea964381bcd24e95b"

RPROVIDES:${PN} += "libfstrcmp.so.0 \
libfstrcmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
