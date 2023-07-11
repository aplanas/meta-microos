SUMMARY = "Courier Unicode Library"
DESCRIPTION = "This library implements several algorithms related to the Unicode Standard: \
* Look up uppercase, lowercase, and titlecase equivalents of a unicode \
  character. \
* Implementation of grapheme and work breaking rules. \
* Implementation of line breaking rules. \
* Several ancillary functions, like looking up the unicode character \
  that corresponds to some HTML 4.0 entity (such as “&amp;”, for \
  example), and determining the normal width or a double-width status of \
  a unicode character. Also, an adaptation of the iconv(3) API for this \
  unicode library. \
This library also implements C++ bindings for these algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "libcourier-unicode7-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "7de749ed81578f4aa40fcd3a08d89098e62bd2eefbde11eeecbfe162beea72a28568c66a2908747c4b6c797919071c3b96a8848c4c8d1b60ff13de1b0e9c02f9"

RPROVIDES:${PN} += "libcourier-unicode.so.7 \
libcourier-unicode7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
