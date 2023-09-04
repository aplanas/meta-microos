SUMMARY = "Communicate with the I3 Window Manager"
DESCRIPTION = "communicate with the i3 window manager"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.17"

RPM_NAME = "perl-AnyEvent-I3-0.17-1.26.noarch.rpm"
RPM_HASH = "699f4ad751d3d1b4735c5beb7bba37e5d23ff5873aed0827e23a08fdb5afd347f543d0085d4dde9cc35dd7aa8ce362383073fa0fd2a87a0340eda1320de7d132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--I3 \
perl-AnyEvent-I3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-JSON--XS"

inherit rpm
