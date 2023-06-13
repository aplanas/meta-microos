SUMMARY = "OpenPGP implementation as a C++ library fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
librnp is the library used by RNP for all OpenPGP functions, useful for \
developers to build against, different from GPGME."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.16.2"

RPM_NAME = "librnp0-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "15b04b4f1396e34afbd8827474fa08a464b0386078abfae810bbf6424155b1f6f6917f30c6de00e918c7ca01e7a53cbbec206238281d3247df0bc50059eba921"

RPROVIDES:${PN} += "librnp.so.0()(64bit) \
librnp0 \
librnp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbotan-2.so.19()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
