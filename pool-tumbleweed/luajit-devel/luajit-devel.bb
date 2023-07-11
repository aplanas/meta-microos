SUMMARY = "Devel files for luajit"
DESCRIPTION = "Devel files for luajit package"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "luajit-devel-2.1.0~beta3+git.1669107176.46aa45d-2.4.aarch64.rpm"
RPM_HASH = "cf81487b70b22bd81270fc423a1ca6803f5c1fbf6a736287179a5359e85ccdc902f3973e87013665506c71d08252923bf3a5eb4fb827d897a7408894b11f6840"

RPROVIDES:${PN} += "libluajit-devel \
luajit-devel \
pkgconfig-luajit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
luajit \
luajit-5-1-2"

inherit rpm
