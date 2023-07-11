SUMMARY = "Development files for neatvnc"
DESCRIPTION = "Development files and headers for neatvnc."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "neatvnc-devel-0.6.0-1.5.aarch64.rpm"
RPM_HASH = "998e693cb4e3409208e3504121574869ce91fc115795d81e94e188027544ad4629e99e6a2ca08587854fa6c7858411b69c4ab4e01cbc050bb654b5ff27bb5957"

RPROVIDES:${PN} += "neatvnc-devel \
pkgconfig-neatvnc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libneatvnc0 \
pkgconfig-aml \
pkgconfig-gbm \
pkgconfig-gnutls \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavutil \
pkgconfig-libdrm \
pkgconfig-libturbojpeg \
pkgconfig-pixman-1 \
pkgconfig-zlib"

inherit rpm
