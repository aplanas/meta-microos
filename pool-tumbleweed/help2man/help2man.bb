SUMMARY = "Script for generating man pages from --help output"
DESCRIPTION = "help2man is a script to create simple man pages from the --help and \
--version output of programs. \
 \
Since most GNU documentation is now in info format, this provides a way \
to generate a placeholder man page pointing to that resource while \
still providing some useful information."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-1.49.3-1.3.aarch64.rpm"
RPM_HASH = "d23eb9cd48fc69a250b7c20d677e3625fab3582442b0fcae9fb7eebe63fcda2b6ae8f6b03b8a818b689b8d15c6dd581277d7355dc82ffd6e0bd36059f963cd02"

RPROVIDES:${PN} += "help2man \
help2man(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6(GLIBC_2.34)(64bit) \
perl-gettext"

inherit rpm
