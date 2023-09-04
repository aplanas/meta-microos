SUMMARY = "Perl extension for checking the open or closed status of a port."
DESCRIPTION = "You can use it to check if a port is open or closed for a given host and \
protocol."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-IO-Socket-PortState-0.03-3.28.noarch.rpm"
RPM_HASH = "fdb1a17c5cdb01267f8b44b3ea681bc78ac97cafb5143047eef67aa71788b7c259a1665539054c3f2ae9d6cddb3a2bd0cf5affe892e38be25d97f845c7e3c6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--PortState \
perl-IO-Socket-PortState"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
