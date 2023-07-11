SUMMARY = "Development files for the Xpresent library"
DESCRIPTION = "This package contains header files and documentation for the Xpresent library."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXpresent-devel-1.0.1-2.1.aarch64.rpm"
RPM_HASH = "0cb2ade2688494da866ae7eeae45a841a90bd1f61621ede4fd3dedfd647481efd057bc9a0d5df65785c16d19088bb5557df8d6be10fddc29a0de0fe0e3eb209a"

RPROVIDES:${PN} += "libXpresent-devel \
pkgconfig-xpresent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXpresent1 \
pkgconfig-presentproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xproto \
pkgconfig-xrandr"

inherit rpm
