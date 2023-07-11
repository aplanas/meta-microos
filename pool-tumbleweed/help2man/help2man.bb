SUMMARY = "Script for generating man pages from --help output"
DESCRIPTION = "help2man is a script to create simple man pages from the --help and \
--version output of programs. \
 \
Since most GNU documentation is now in info format, this provides a way \
to generate a placeholder man page pointing to that resource while \
still providing some useful information."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-1.49.3-1.4.aarch64.rpm"
RPM_HASH = "f2b162597a0104fd4c9f40ef0eff30760a7738cf44d960a145035f81ff649b7d41d91e20d6818678d70bed95ec16c6b99f343b6adf05a4307da909afb104fd69"

RPROVIDES:${PN} += "help2man"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl-gettext"

inherit rpm
