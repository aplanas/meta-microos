SUMMARY = "The info pages of the Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-std-7.0.3-1.1.noarch.rpm"
RPM_HASH = "e4fc1641482ff64e469017ec1921ea890458140506fb1929131474432dcaf6269db868f329b87a338b88c795da47049b7468d0d80a92d15f396022d7970a47dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-std"
RDEPENDS:${PN} += ""

inherit rpm
