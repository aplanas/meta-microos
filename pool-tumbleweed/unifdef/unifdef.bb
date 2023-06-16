SUMMARY = "Removes ifdefs from C files"
DESCRIPTION = "Unifdef is useful for removing ifdef'ed lines from a file while otherwise \
leaving the file alone.  Unifdef acts on #ifdef, #ifndef, #else, and #endif \
lines, and it knows only enough about C to know when one of these is \
inactive because it is inside a comment, or a single or double quote."
LICENSE = "BSD-2-Clause"

PV = "2.12"

RPM_NAME = "unifdef-2.12-2.4.aarch64.rpm"
RPM_HASH = "b9a42dd7968104da8510f1f76313ee066f58ab387d9179dfbf7b09c2ac69fd0002b34a6b9cdf41e9acc7be6acfa6615f5c510cb11f353e2e99e4325c05fda4a1"

RPROVIDES:${PN} += "unifdef"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
