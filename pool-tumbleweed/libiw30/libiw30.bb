SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw30-30.pre9-40.7.aarch64.rpm"
RPM_HASH = "e68d451982515b85d45a19df62881c19b263c2b399bf182d45e45e93cea506d39cc1f7db39296b7c7c070e6be399514d40fe073bac5117b74a01e77abcc3e13d"

RPROVIDES:${PN} += "libiw \
libiw.so.30()(64bit) \
libiw30 \
libiw30(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
