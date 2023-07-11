SUMMARY = "Communicate with the I3 Window Manager"
DESCRIPTION = "communicate with the i3 window manager"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.17"

RPM_NAME = "perl-AnyEvent-I3-0.17-1.25.noarch.rpm"
RPM_HASH = "7009819ac1bde43b04dcb82718bfa86b5985339ab1c409dab45a9f6f317684c0ad1a81897e3c49645a5f54bc49e9650fc736f359caeabfdc3137a11061b478a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--I3 \
perl-AnyEvent-I3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-JSON--XS"

inherit rpm
