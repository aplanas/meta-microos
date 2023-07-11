SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory1-20220105-2.6.aarch64.rpm"
RPM_HASH = "66bdecd9c699b4d49d2c1bccdfd716d4ef80cd05209cce99fc23cf5f06f11a8dea5a79598c390cfd0707522aa0724328aba99b783c116a6dd98bd65b53f16075"

RPROVIDES:${PN} += "libcdirectory.so.1 \
libcdirectory1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libuna.so.1"

inherit rpm
