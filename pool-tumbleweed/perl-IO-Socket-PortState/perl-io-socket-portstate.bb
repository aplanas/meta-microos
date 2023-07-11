SUMMARY = "Perl extension for checking the open or closed status of a port."
DESCRIPTION = "You can use it to check if a port is open or closed for a given host and \
protocol."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-IO-Socket-PortState-0.03-3.27.noarch.rpm"
RPM_HASH = "521e792dc98af7df9952def09de2c415c1b372010a97d370088293c91fcb225dd5df7df56617bca501d6681c5f16d5ef6886e6a9c6aa80a9f4e726a698a0d1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--PortState \
perl-IO-Socket-PortState"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
