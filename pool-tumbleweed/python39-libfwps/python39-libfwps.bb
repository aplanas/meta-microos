SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python39-libfwps-20230202-1.7.aarch64.rpm"
RPM_HASH = "611be2bc1d6c44c796d5a7accbce49ec83d7e7e6fe0869e99fbf62de75e926260874cd3e19578cbe737ebf07b8c292e9ad9290b0d7e1c26c547e4bdd52930256"

RPROVIDES:${PN} += "python39-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
python-abi"

inherit rpm
