SUMMARY = "Development files for kcontacts"
DESCRIPTION = "Development files for kcontacts, a Qt5 library to access \
address books."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcontacts-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f2e5f30f41e27f447820bc299ddc748680808ba90e1a19c1364b50dee05ce5d61345300e7bb2b4e0b8a100395ac6a9f3a0f8d99fc1b1f5035684484b4f0defa3"

RPROVIDES:${PN} += "cmake-KF5Contacts \
kcontacts-devel \
kcontacts5-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5I18n \
libKF5Contacts5"

inherit rpm
