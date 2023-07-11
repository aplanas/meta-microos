SUMMARY = "Development files for Allegro's loadpng"
DESCRIPTION = "This package is needed to build programs that use Allegro's loadpng."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng44-devel-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "6303c3bf1a781980bb1128a5a715be7c1bca81ff8522d8f1063b1a7fbf3e7783211e355d51448f0edd02cb5377f361bf543c044c6794d01fcb18fc7ae4c237d9"

RPROVIDES:${PN} += "libloadpng-devel \
libloadpng44-devel \
pkgconfig-loadpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libloadpng4-4 \
pkgconfig-allegro"

inherit rpm
