SUMMARY = "Library for C error functions"
DESCRIPTION = "A library for C error functions. \
 \
This package is part of the libyal library collection and is used by \
other libraries in the collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20220101"

RPM_NAME = "libcerror1-20220101-4.2.aarch64.rpm"
RPM_HASH = "2380785483f7bb0dd2e452e549da26c4f3508a7f9936e693cb08b40ebd7916a650630d223c2132018cdd7cc228618544c86df2d00fc13f45c40274b9b6fb343f"

RPROVIDES:${PN} += "libcerror.so.1 \
libcerror1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
