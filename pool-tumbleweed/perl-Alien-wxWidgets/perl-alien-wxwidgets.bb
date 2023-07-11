SUMMARY = "Building, finding and using wxWidgets binaries"
DESCRIPTION = "Please see Alien for the manifesto of the Alien namespace. \
 \
In short 'Alien::wxWidgets' can be used to detect and get configuration \
settings from an installed wxWidgets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.69"

RPM_NAME = "perl-Alien-wxWidgets-0.69-1.17.aarch64.rpm"
RPM_HASH = "1803fa2cb704eeb004df5afce339620c2a9ba611059ad987f279689b339a7a1d20ec2c4caaddd9a93fd7ba5e8a735ffe47c5ac9f3552f202a5ec94e624f1138b"

RPROVIDES:${PN} += "perl-Alien--wxWidgets \
perl-Alien--wxWidgets--Config--gtk2-3-0-5-uni-gcc-3-4 \
perl-Alien--wxWidgets--Utility \
perl-Alien-wxWidgets"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Pluggable"

inherit rpm
