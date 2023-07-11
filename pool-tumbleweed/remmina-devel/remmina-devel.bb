SUMMARY = "Development Files for remmina"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-devel-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "d02561bfc7f6c81085fe5d341567aecf0b9e0f3ab6b8ef20348b70f22dcff68363eaa06f95698c5c74d04668d49b2813caeac29966df3d566eeb80340ffa58b1"

RPROVIDES:${PN} += "pkgconfig-remmina \
remmina-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
remmina"

inherit rpm
