SUMMARY = "Development files for WindowMaker"
DESCRIPTION = "This package contains the header files and libraries necessary for \
developing applications which use WindowMaker."
LICENSE = "GPL-2.0-or-later"

PV = "0.95.9"

RPM_NAME = "WindowMaker-devel-0.95.9-2.11.aarch64.rpm"
RPM_HASH = "f352ef2044da2edbd7ff6c4c17d11048673738e99647144a7da7ac00a9b3d769088893974bda0e59f5c561f705abdf2133aff7e42a36cdf63a19e12407000bd4"

RPROVIDES:${PN} += "WindowMaker-devel \
pkgconfig-WINGs \
pkgconfig-WUtil \
pkgconfig-wmlib \
pkgconfig-wrlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
WindowMaker \
pkgconfig-WUtil \
pkgconfig-wrlib \
pkgconfig-x11"

inherit rpm
