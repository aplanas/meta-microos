SUMMARY = "Development files for the Osmocom GPRS Gb interface library"
DESCRIPTION = "The libosmogb library contains a GPRS BSSGP protocol implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogb."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogb-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "5c647cbd624b6157c2b625c66b0819677e66456d68cdf9d26ec92c2c47554073a62038422bb4382f88db17f64e0456b7653f4fff977ce8357bc51d3f5c0ba665"

RPROVIDES:${PN} += "libosmogb-devel \
pkgconfig-libosmogb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmogb14 \
libosmogsm-devel \
pkgconfig-libosmocore \
pkgconfig-libosmovty \
pkgconfig-talloc"

inherit rpm
