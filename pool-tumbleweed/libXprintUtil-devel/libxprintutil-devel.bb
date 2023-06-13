SUMMARY = "Development files for the Xprint printer utility library"
DESCRIPTION = "libXprintUtil provides utility Xpu APIs allowing client applications \
to access and manipulate information about printer capabilities from \
an Xprint server. \
 \
This package contains the development headers for the library found \
in libXprintUtil1."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXprintUtil-devel-1.0.1-13.1.aarch64.rpm"
RPM_HASH = "196373cdd543bae822edd9adec9a989dbe4b975176566ef314d12e1bb0b002b16c0cd5dc8c417d83f7d29c926b050457c3204d60a66708e83a41d19024070810"

RPROVIDES:${PN} += "libXprintUtil-devel \
libXprintUtil-devel(aarch-64) \
pkgconfig(xprintutil) \
xorg-x11-libXprintUtil-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXprintUtil1 \
pkgconfig(printproto) \
pkgconfig(x11) \
pkgconfig(xp) \
pkgconfig(xt)"

inherit rpm
