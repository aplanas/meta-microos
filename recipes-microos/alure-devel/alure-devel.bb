SUMMARY = "Development files for alure"
DESCRIPTION = "The alure-devel package contains libraries and header files for \
developing applications that use alure."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-devel-1.2-4.4.aarch64.rpm"
RPM_HASH = "d48d7502d772361706df469a4a76001530452f014a2e25b0f83be8b242c32e9b735b0128bb6e3323ca2fb1d85d531739fdb568a8197bd7c894e7adaa03c74beb"

RPROVIDES:${PN} += "alure-devel alure-devel(aarch-64) pkgconfig(alure)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libalure1 pkgconfig(openal)"

inherit rpm
