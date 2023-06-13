SUMMARY = "R - statistics package (S-Plus like)"
DESCRIPTION = "R is a language which is not entirely unlike the S language developed at \
AT&T Bell Laboratories by Rick Becker, John Chambers and Allan Wilks."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-base-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "efdde58e04101d8cfd5a158600aaf6521fed53cab4683ca19be3ff1bfb5dcb24b254c7273bcb476db940042d9071087a3ef52f59a7ccba46c9dfb65f8fe7e951"

RPROVIDES:${PN} += "R \
R-base \
R-base(aarch-64)"

RDEPENDS:${PN} += "R-base-devel \
R-core \
R-core-devel \
R-core-doc \
R-core-libs \
R-core-packages \
R-recommended-packages \
fontconfig \
glibc-locale \
make \
xdg-utils \
xorg-x11-fonts-100dpi \
xorg-x11-fonts-75dpi"

inherit rpm
