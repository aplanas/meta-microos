SUMMARY = "Development files for libstilview"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libstilview."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.0"

RPM_NAME = "libstilview-devel-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "898225d009bb387275cd0c74760b1bd5d4df347c6ae31f0093010c4ae13197b28f209f09707faa6e3f2692eb1835dff955e5139d0963b4fd8d27956b32028ffa"

RPROVIDES:${PN} += "libstilview-devel \
pkgconfig-libstilview"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstilview0"

inherit rpm
