SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.4"

RPM_NAME = "aqbanking-ofx-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "44eb5045ee80bbee17470c3c1aae3d9fceb09dbca3e190edcb8c28c65cfa6c27972cdea83eed73b33b625f6369b8fd2c10b5fe9339e7fe92fbd6fd15e08d6924"

RPROVIDES:${PN} += "aqbanking-ofx \
aqbanking-ofx(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
aqbanking \
ld-linux-aarch64.so.1()(64bit) \
libaqbanking.so.44()(64bit) \
libc.so.6()(64bit) \
libgwenhywfar.so.79()(64bit)"

inherit rpm
