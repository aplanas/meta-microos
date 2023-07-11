SUMMARY = "Development files for osmo-fl2k"
DESCRIPTION = "Library headers for osmo-fl2k driver."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-devel-0.1.1+git.20200602-1.12.aarch64.rpm"
RPM_HASH = "57e4fb81b3b2aff42232996c83a775a77669381697ac7a7371ec2c2da4bc4cf19a8688bb0233bf7828c706eef90c44ecbc9c9ab6c2aeeee22b452ae2ccae280c"

RPROVIDES:${PN} += "osmo-fl2k-devel \
pkgconfig-libosmo-fl2k"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
osmo-fl2k"

inherit rpm
