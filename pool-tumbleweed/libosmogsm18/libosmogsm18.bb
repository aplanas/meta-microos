SUMMARY = "Osmocom GSM utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogsm library in particular is a collection of common code \
used in various GSM related sub-projects inside the Osmocom family of \
projects. It includes A5/1 and A5/2 ciphers, COMP148v1, a LAPDm \
implementation, a GSM TLV parser, SMS utility routines as well as \
protocol definitions for a series of protocols."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogsm18-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "6917e8f216e29db71ddadd779063dec2129aac2562e6ad0407fa17527c70e8bf7c8c4d0b245f3cf31ddffe700445234b81b34063a1a44e208d22ea72cdab486d"

RPROVIDES:${PN} += "libosmogsm.so.18()(64bit) \
libosmogsm18 \
libosmogsm18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libosmocore.so.20()(64bit) \
libosmoisdn.so.0()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
