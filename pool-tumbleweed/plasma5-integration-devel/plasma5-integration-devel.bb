SUMMARY = "plasma5-integration development headers"
DESCRIPTION = "This package provides development headers for plasma5-integration. They \
are not meant to be used standalone, but are required for building other \
Plasma components."
LICENSE = "GPL-2.0+"

PV = "5.27.7"

RPM_NAME = "plasma5-integration-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "54fd15278cf4d99ce133982c1d37f10c521971c83add150897cbc14fe05e9c5aa050c1758c8c75b8a39fc97869e42b79708c1fc958d38479a94903c56b926e33"

RPROVIDES:${PN} += "pkgconfig-plasma-key-data \
plasma5-integration-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
plasma5-integration-plugin"

inherit rpm
