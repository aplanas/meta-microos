SUMMARY = "Development files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This subpackage contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-devel-2.8.1-1.4.aarch64.rpm"
RPM_HASH = "0bb92b16030dd5d4263fa593f1eb6d43cfc0fa27616c680575b62f374a9e1aafead752d1dd68f4ce65b8f327882afd31cf9cb9230503d542d824bdd42ff61258"

RPROVIDES:${PN} += "libpinyin-devel \
libzhuyin-devel \
pkgconfig-libpinyin \
pkgconfig-libzhuyin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpinyin-tools \
libpinyin15 \
libzhuyin15 \
pkgconfig-glib-2.0"

inherit rpm
