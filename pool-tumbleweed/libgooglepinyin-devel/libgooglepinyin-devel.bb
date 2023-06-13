SUMMARY = "Development files for libgooglepinyin"
DESCRIPTION = "The libgooglepinyin-devel package includes the header files for the googlepinyin package."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin-devel-0.1.2-12.28.aarch64.rpm"
RPM_HASH = "9c6aeef15951cd40cb1e05509a35aa7ebf37372496030d3cf7f04cb07cbd9da4cb918a57003a3b375919367fc679dd7033be3789e3deb6bdbdfb796dcd4d7964"

RPROVIDES:${PN} += "libgooglepinyin-devel \
libgooglepinyin-devel(aarch-64) \
pkgconfig(googlepinyin)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgooglepinyin0 \
python-base"

inherit rpm
