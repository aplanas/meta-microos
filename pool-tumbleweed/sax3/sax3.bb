SUMMARY = "A Graphical Configuration Tool for X"
DESCRIPTION = "A graphical utility for configuring X server settings. It can run without X with a graphical interface. \
 \
Authors: \
_______ \
Manu Gupta \
Michal Hrusecky"
LICENSE = "GPL-3.0"

PV = "0.1.2"

RPM_NAME = "sax3-0.1.2-6.42.aarch64.rpm"
RPM_HASH = "80e2e169f7a023406ec6d63a9a93182853f3338034fac937db39814ed52cfbebfed2b93e3f15cd27749346dd93bea1dc27a1ec7958cd9abe3c45214255ee2e61"

RPROVIDES:${PN} += "libsax3-yuif.so \
sax3"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
