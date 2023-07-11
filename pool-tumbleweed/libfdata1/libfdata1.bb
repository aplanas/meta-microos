SUMMARY = "Library to provide generic file data functions"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libfdata1-20230319-1.2.aarch64.rpm"
RPM_HASH = "841ced7dc889e31b845d8ad65e9f52d760c2a35e2c9dc4c9d0ef837011e4534a2755efeb82faaaafcbd4a757141cbde43ed0dea2e15cc93eb909ce3fb39daba1"

RPROVIDES:${PN} += "libfdata.so.1 \
libfdata1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfcache.so.1"

inherit rpm
