SUMMARY = "Removes ifdefs from C files"
DESCRIPTION = "Unifdef is useful for removing ifdef'ed lines from a file while otherwise \
leaving the file alone.  Unifdef acts on #ifdef, #ifndef, #else, and #endif \
lines, and it knows only enough about C to know when one of these is \
inactive because it is inside a comment, or a single or double quote."
LICENSE = "BSD-2-Clause"

PV = "2.12"

RPM_NAME = "unifdef-2.12-2.5.aarch64.rpm"
RPM_HASH = "f4fb0e9494693199d7c99712d46e64ff8b241b48e4cedf14dc53e21a9a8315547fc7eb1fd4cbf07f75cefbd8a924b527ff7e18e74fcb263bc94a7a7430a3d17e"

RPROVIDES:${PN} += "unifdef"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
