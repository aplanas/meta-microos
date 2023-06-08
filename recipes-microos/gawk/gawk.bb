SUMMARY = "Domain-specific language for text processing"
DESCRIPTION = "AWK is a domain-specific language designed for text processing and \
typically used as a data extraction and reporting tool. \
 \
GNU awk is upwardly compatible with the System V Release 4 awk.  It is \
almost completely POSIX 1003.2 compliant."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.1"

RPM_NAME = "gawk-5.2.1-2.3.aarch64.rpm"
RPM_HASH = "326927033582d3a8c52b1d8faf4b21842e9fc4859107fff291661940a425b989d7166f6b49a340a5f8550fb0ef3d74c369d2684f9e9a70dfcc6a17caf084917e"

RPROVIDES:${PN} += "/bin/awk /bin/gawk awk config(gawk) gawk gawk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libreadline.so.8()(64bit)"

inherit rpm
