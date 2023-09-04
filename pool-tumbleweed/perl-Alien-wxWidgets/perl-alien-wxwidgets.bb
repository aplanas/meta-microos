SUMMARY = "Building, finding and using wxWidgets binaries"
DESCRIPTION = "Please see Alien for the manifesto of the Alien namespace. \
 \
In short 'Alien::wxWidgets' can be used to detect and get configuration \
settings from an installed wxWidgets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.69"

RPM_NAME = "perl-Alien-wxWidgets-0.69-1.18.aarch64.rpm"
RPM_HASH = "5423602f3eae579e39a386a589bfd1b41f870086de96da7e1db565946cfbb251ce56c56dc95ef57f18cc72c19ea23ed1ea39eaeb3dac63527588593a1e71ebc4"

RPROVIDES:${PN} += "perl-Alien--wxWidgets \
perl-Alien--wxWidgets--Config--gtk2-3-0-5-uni-gcc-3-4 \
perl-Alien--wxWidgets--Utility \
perl-Alien-wxWidgets"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Pluggable"

inherit rpm
