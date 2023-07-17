SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt5 library to access \
address books."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcontacts-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1d4934f29f0e3fa2fa66382364a9840c2d994118fac60325842bf9230965ba1cd11685cace9352511dc69b8bab467c6dda9dcfcaf0cac3195350191a1302b42e"

RPROVIDES:${PN} += "cmake-KF5Contacts \
kcontacts-devel \
kcontacts5-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5I18n \
libKF5Contacts5"

inherit rpm
