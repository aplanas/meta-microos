SUMMARY = "Development Files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides development headers for it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-devel-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "f4167e8e3e57985b3ee16305e823c8af5db54271b1859065a9521e7fb7a943270efee84d313e49b3f3064eaedf72b0200ad0a542efb2c70d3015e2e8c0f011b5"

RPROVIDES:${PN} += "libsunpinyin-devel \
pkgconfig(sunpinyin-2.0) \
sunpinyin-devel \
sunpinyin-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsunpinyin3 \
pkgconfig(sqlite3) \
sunpinyin-tools"

inherit rpm
