SUMMARY = "Development files for libgooglepinyin"
DESCRIPTION = "The libgooglepinyin-devel package includes the header files for the googlepinyin package."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin-devel-0.1.2-12.29.aarch64.rpm"
RPM_HASH = "ded3cc13f3aaaddf4fc62e4e3f835549cd1cd60b0f7b7ae8beb3a09823249ea71034125a8a1454dc342daaf4b6341bb55a6b6ba7cfed9903c683b99041c9bcd9"

RPROVIDES:${PN} += "libgooglepinyin-devel \
pkgconfig-googlepinyin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgooglepinyin0 \
python-base"

inherit rpm
