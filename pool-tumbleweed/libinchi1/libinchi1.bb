SUMMARY = "The IUPAC International Chemical Identifier library"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the InChi shared library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "libinchi1-1.06-2.3.aarch64.rpm"
RPM_HASH = "9eff327f848d84cf21292d83d8a604004fcc7b44626ce54fbe174421898fa8c45290fbecbd50bcb456fda8172c755e54c2da4d8cff1e71428e1ca8d4ba42a6c7"

RPROVIDES:${PN} += "libinchi.so.1()(64bit) \
libinchi1 \
libinchi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
