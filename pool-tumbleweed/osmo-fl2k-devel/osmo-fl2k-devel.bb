SUMMARY = "Development files for osmo-fl2k"
DESCRIPTION = "Library headers for osmo-fl2k driver."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-devel-0.1.1+git.20200602-1.11.aarch64.rpm"
RPM_HASH = "86cc19ca80802e778ed0d07b3bf81b0aac47c41e52dcc0a5355657796bc3cd8cfe1323233e2087353b7626306ec38c4c885499e8f8f0e2919a5f1d6d442cafce"

RPROVIDES:${PN} += "osmo-fl2k-devel \
pkgconfig-libosmo-fl2k"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
osmo-fl2k"

inherit rpm
