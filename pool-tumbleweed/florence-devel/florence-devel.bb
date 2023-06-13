SUMMARY = "Development files for florence"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use florence."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "florence-devel-0.6.3-5.10.aarch64.rpm"
RPM_HASH = "e052a440b30998a0cd3afa557ae7eb88b70b8b0f101efedeacbd36a9ba7520b64296484365eaf93562fe4759da429ee026307f35290fe4d70508cf45822358f0"

RPROVIDES:${PN} += "florence-devel \
florence-devel(aarch-64) \
pkgconfig(florence-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
florence \
pkgconfig(gio-2.0)"

inherit rpm
