SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python39-libfwps-20230711-2.1.aarch64.rpm"
RPM_HASH = "2aa47bc281c12ef1827035f520177b0b4ef43b359ff3163d6ca31f99206b109c41b2e30a1b74a7cf41063a02f01287c08e4d0f4185aaf1439f4c35260b99235a"

RPROVIDES:${PN} += "python39-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
