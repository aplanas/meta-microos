SUMMARY = "Development files for libvidstab1_1"
DESCRIPTION = "Development (headers and libraries) files for libvidstab1_1."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libvidstab-devel-1.1.0-2.20.aarch64.rpm"
RPM_HASH = "887634f45c10a05c40453f993217cbe843f3c82571ce39482ee397b96e287dddf0f8e9f93356ee92162e00420267a4917bd97630883d005799c8dc1be2844989"

RPROVIDES:${PN} += "libvidstab-devel \
pkgconfig-vidstab"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvidstab1-1"

inherit rpm
