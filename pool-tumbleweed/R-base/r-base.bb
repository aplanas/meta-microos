SUMMARY = "R - statistics package (S-Plus like)"
DESCRIPTION = "R is a language which is not entirely unlike the S language developed at \
AT&T Bell Laboratories by Rick Becker, John Chambers and Allan Wilks."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-base-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "063ed5d6bf88e96bbb2a5ce2d0c51021df73813a5a03c3787d772312b98c549d1bd425d03f6c1260e52eb5296c166298c5fe333889c3ed73a87a82f58a14f166"

RPROVIDES:${PN} += "R \
R-base"

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
