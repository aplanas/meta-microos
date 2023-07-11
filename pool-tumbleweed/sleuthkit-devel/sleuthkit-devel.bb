SUMMARY = "Development files for sleuthkit"
DESCRIPTION = "The sleuthkit-devel package contains libraries and header files for \
developing applications that use sleuthkit."
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "sleuthkit-devel-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "831fd9f87714bf24678b2c6c13e4106f787b1d456df7c4d4d96492b837bdddb7132a65bd7d823a9d39eff87ad700107f9ccd5bf298d19833b74a704c9a679ce8"

RPROVIDES:${PN} += "pkgconfig-tsk \
sleuthkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtsk19 \
pkgconfig-libewf \
pkgconfig-zlib"

inherit rpm
