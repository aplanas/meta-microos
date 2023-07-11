SUMMARY = "Development files for libcompizconfig"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager. \
 \
This package contains development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-devel-0.8.18-2.12.aarch64.rpm"
RPM_HASH = "fa5244dd1977f5ecb84a3e67c4df1bff7dec1e2dcad1aec09b0ef0d0557f82c18e2e1c0ae8ba9288c579ac44a50d96084d30c49552b0fb8c56adc18352d8ad01"

RPROVIDES:${PN} += "libcompizconfig-devel \
pkgconfig-libcompizconfig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcompizconfig \
pkgconfig \
pkgconfig-compiz \
pkgconfig-libxml-2.0 \
pkgconfig-protobuf \
pkgconfig-x11"

inherit rpm
