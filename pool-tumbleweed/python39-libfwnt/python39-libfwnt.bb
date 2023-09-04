SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python39-libfwnt-20220922-3.1.aarch64.rpm"
RPM_HASH = "b23346acbf51a2613c0ba9d2e5784ea9b72a4c29ca4695f0dc9df644dd1f92fc43b29f94653f879547249fb87fb513f59f60bbc760f52fb6a285d58bc9d336b9"

RPROVIDES:${PN} += "python39-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
