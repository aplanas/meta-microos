SUMMARY = "Development files for libmirisdr"
DESCRIPTION = "Library headers and other development files for mirisdr driver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "libmirisdr-devel-0.0.0+git.20130608-1.24.aarch64.rpm"
RPM_HASH = "26444a73485233c34a120f8dfcc07373d8e372c3f55ec5a9db3a1e26f27e2d66e94ff008ce4f7263f1811763a69bcfdcf67cb0596060d679475650b6bde357b9"

RPROVIDES:${PN} += "libmirisdr-devel \
pkgconfig-libmirisdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmirisdr"

inherit rpm
