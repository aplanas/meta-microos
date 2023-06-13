SUMMARY = "Development files for the Osmocom muxed audio library"
DESCRIPTION = "Network interface demuxer library for OsmoCom projects. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-netif."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmonetif-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "ab8d58806935c148a342e82c75852b222b25f22edc49a97c174d029c0f382958d6b1e906f80f338b24481e842289ba3d763106479cba6af17c9274a83f20c2fc"

RPROVIDES:${PN} += "libosmonetif-devel \
libosmonetif-devel(aarch-64) \
pkgconfig(libosmo-netif)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmonetif11"

inherit rpm
