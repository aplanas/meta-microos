SUMMARY = "Data files for the libpinyin IME"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides language model table data for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-data-2.8.1-1.4.aarch64.rpm"
RPM_HASH = "a06b988994dddd1c0e8e7c68826b93532a94108a804c851d1fc84d89b61bc9aaf3c1568712d3bb251472d4a294b208f848d9859fb8d9a11825f4931839b4a00f"

RPROVIDES:${PN} += "libpinyin-data"

RDEPENDS:${PN} += ""

inherit rpm
