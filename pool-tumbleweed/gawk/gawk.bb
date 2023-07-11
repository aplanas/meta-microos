SUMMARY = "Domain-specific language for text processing"
DESCRIPTION = "AWK is a domain-specific language designed for text processing and \
typically used as a data extraction and reporting tool. \
 \
GNU awk is upwardly compatible with the System V Release 4 awk.  It is \
almost completely POSIX 1003.2 compliant."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.2"

RPM_NAME = "gawk-5.2.2-2.2.aarch64.rpm"
RPM_HASH = "c91ee53ccd7739d360b8345606453c3ebfbadc3a683b024596d5f4a36989adbfa362e87c61c4a1967ce7de2037a5951191288ce42669c2945078d5a4afecec03"

RPROVIDES:${PN} += "/usr/bin/awk \
/usr/bin/gawk \
awk \
config-gawk \
gawk"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libreadline.so.8"

inherit rpm
