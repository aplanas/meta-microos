SUMMARY = "Tools for Mifare cards"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains example programs using libfreefare for \
inspecting and manipulating Mifare cards."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-tools-0.4.0-4.32.aarch64.rpm"
RPM_HASH = "40dd61fe492cefa25456d1f58a01766d6a856ff6642077a8fc14121d1147824a1fbdf831ccd3db636bc4b49e9dbdc0330fcc5d8889a767d42cb8b9be0cdfd699"

RPROVIDES:${PN} += "libfreefare-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreefare.so.0 \
libnfc.so.6"

inherit rpm
