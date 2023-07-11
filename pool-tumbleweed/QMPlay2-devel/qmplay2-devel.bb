SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "23.06.17"

RPM_NAME = "QMPlay2-devel-23.06.17-1.1.noarch.rpm"
RPM_HASH = "c418c5c314dea9f5520ad6fdc29ba66cc4d74a8a8bf0ac05664ac8abe7fcced8333cf4c89694bfc78a37bd033920b163198ee312c471e8e40bc5d2e407ad6829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"

RDEPENDS:${PN} += "QMPlay2"

inherit rpm
