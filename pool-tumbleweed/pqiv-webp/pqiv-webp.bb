SUMMARY = "Backend webp for pqiv"
DESCRIPTION = "Backend webp for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-webp-2.12-1.4.aarch64.rpm"
RPM_HASH = "a99ee38d8a2f5535edafd93369621eea13a604692b7088a73b9faa088284382c78e4464ab04f95b96a2b756267a582e7d74c23c619029a4e45e4943e5abb1ca2"

RPROVIDES:${PN} += "pqiv-webp \
pqiv-webp(aarch-64)"
RDEPENDS:${PN} += "libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libwebp.so.7()(64bit) \
pqiv"

inherit rpm
