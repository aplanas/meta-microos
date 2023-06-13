SUMMARY = "Support for Internationalized Domain Names (IDN)"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-0-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "03bb25802e865e42cfa2519452227702eb65fe15ad1a7a7ef9731acb7a99fa81876decb25ded8ade771a20c537ffdbd386838506094d6c68dc45f0de3ebb443f"

RPROVIDES:${PN} += "libidn2 \
libidn2-0 \
libidn2-0(aarch-64) \
libidn2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
