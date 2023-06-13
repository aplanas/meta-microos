SUMMARY = "Check memory plugin for Nagios"
DESCRIPTION = "We have always monitored RAM usage on all of boxes. Sure, there's the argument \
that unused RAM is money wasted, but I always like to know not just when the \
box is swapping, but when it's about to start swapping. There have been a few \
plugins over the years that I've used for this - check_ram for Solaris, \
check_mem for Linux, and there's also check_mem.pl."
LICENSE = "MIT"

PV = "20120618"

RPM_NAME = "monitoring-plugins-mem-20120618-102.10.noarch.rpm"
RPM_HASH = "5f46d34676c797ebad7dd9f0cba0f8c513100b25742926b5e72beab969fde1af78a3c4211a5cf1f92d9a78697d1a773a0aa236097ad49df8c7f09038c994c30d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-mem) \
monitoring-plugins-mem \
nagios-plugins-mem"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
