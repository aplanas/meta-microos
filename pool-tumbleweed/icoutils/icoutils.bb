SUMMARY = "Extracting and Converting Microsoft Icon and Cursor Files"
DESCRIPTION = "The icoutils are a set of programs for extracting and converting images \
in Microsoft Windows icon and cursor files. These files usually have the \
extension .ico or .cur, but they can also be embedded in executables or \
libraries (.dll-files)."
LICENSE = "GPL-3.0-or-later"

PV = "0.32.3"

RPM_NAME = "icoutils-0.32.3-2.4.aarch64.rpm"
RPM_HASH = "685550e5e5434f85af4802bc50f1b3a588bb28ffb16e66c9b05b31467f4e64c19f37ab69d4e17e6b714dd51d3db430c6c8270d0f986581a4b434fabcf4849048"

RPROVIDES:${PN} += "icoutils"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
