SUMMARY = "Data files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the data files for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "kkc-data-0.3.6~git20200818.e33e7fb-1.17.aarch64.rpm"
RPM_HASH = "d3fb180e325653682e8ad6a4f52c456bedf879fbd62cb3b10dd5ef1dba70ee3ad5cc1fc05d712648f0ccd6f7d457c66bc2bb6b279f1d36569d574ad699f68b3e"

RPROVIDES:${PN} += "kkc-data \
kkc-data(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
