SUMMARY = "Development files for non-ntk"
DESCRIPTION = "This package contains development files for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-devel-1.3.1001-1.7.aarch64.rpm"
RPM_HASH = "3b20729c32ea4fa30ea293da3ba17995182f18cd235f85eb18944ccde8fa00024474aaf9d824b32419928f80ab9e404a972329b826709a3a72184dd6c152fa5e"

RPROVIDES:${PN} += "non-ntk-devel \
pkgconfig-ntk \
pkgconfig-ntk-gl \
pkgconfig-ntk-images"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntk1 \
pkgconfig-cairo \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xft"

inherit rpm
