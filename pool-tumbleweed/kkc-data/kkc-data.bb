SUMMARY = "Data files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the data files for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "kkc-data-0.3.6~git20200818.e33e7fb-1.18.aarch64.rpm"
RPM_HASH = "f1d08d21bfc90d1a27c5d90626ae7a0f21c21f573b97afd7b5ddb14a2af190f283e25bb0d529ae9bd321ca745352b2a36ded024ffe0ca8f5e8d33ba7c639168c"

RPROVIDES:${PN} += "kkc-data"

RDEPENDS:${PN} += ""

inherit rpm
