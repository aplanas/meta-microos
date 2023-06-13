SUMMARY = "News Reader for Text Terminals"
DESCRIPTION = "neix is a RSS/Atom news feed reader."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "neix-0.1.5-1.9.aarch64.rpm"
RPM_HASH = "037a02e1d1a6d341150c5b5c5d45f0ade0ba76b223ba70e0dfb3bd110fc8d549b56945a01a99c5a506994e5f59df9b5ab2a0f06402b707eecfee1e664b88f628"

RPROVIDES:${PN} += "neix \
neix(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
