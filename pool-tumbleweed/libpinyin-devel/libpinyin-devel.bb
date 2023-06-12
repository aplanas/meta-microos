SUMMARY = "Development files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This subpackage contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-devel-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "0023fb843409cd4967b42732feb16ab6a3b388abdbc5e35a2240f0b9df3ffff0f3bde6d44d1839fa5b23cb31ea1a1dceb3dac909a4000d9ee7a3c23d906eb5c0"

RPROVIDES:${PN} += "libpinyin-devel \
libpinyin-devel(aarch-64) \
libzhuyin-devel \
pkgconfig(libpinyin) \
pkgconfig(libzhuyin)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpinyin-tools \
libpinyin15 \
libzhuyin15 \
pkgconfig(glib-2.0)"

inherit rpm
