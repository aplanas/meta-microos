SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "This package contains the libraries for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult0_1-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "16449db16da2b4839501e327faa73bf4720294c70c9b5779a25c218351f93034fd25d7bfdff00cbe67befc5c7caf2aefe8f12e4eff9a223af68f51402bb17cac"

RPROVIDES:${PN} += "libimagevisualresult.so.0.1 \
libimagevisualresult0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libimagevisualresult-data \
libm.so.6 \
libstdc++.so.6"

inherit rpm
