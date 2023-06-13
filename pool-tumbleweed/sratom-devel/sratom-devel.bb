SUMMARY = "Development files for libsratom"
DESCRIPTION = "Development files for libsratom."
LICENSE = "ISC"

PV = "0.6.14"

RPM_NAME = "sratom-devel-0.6.14-1.1.aarch64.rpm"
RPM_HASH = "dc15621e0203e7356f79b3d280fa9f2ce9d1ac14e79122aad42108c5ca925a942b776f3cd130b68f671a42007c04c580c8d084b8064314712983175bcb52df0a"

RPROVIDES:${PN} += "libsratom-0-devel \
pkgconfig(sratom-0) \
sratom-devel \
sratom-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsratom-0-0 \
pkgconfig(lv2) \
pkgconfig(serd-0) \
pkgconfig(sord-0)"

inherit rpm
