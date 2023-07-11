SUMMARY = "Development Files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides development headers for it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-devel-2.0.99.2-2.3.aarch64.rpm"
RPM_HASH = "88c6d320414294c58d1d336cf925c21ae2cd3dd4e0a7290462a61561898319fbbbca7ac4ad4b84492c88beec8b5d754ea58af30a6ddc80d0baa18f9b2f3574f0"

RPROVIDES:${PN} += "libsunpinyin-devel \
pkgconfig-sunpinyin-2.0 \
sunpinyin-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsunpinyin3 \
pkgconfig-sqlite3 \
sunpinyin-tools"

inherit rpm
