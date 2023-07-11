SUMMARY = "Development files for libsidplayfp"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libsidplayfp."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libsidplayfp-devel-2.4.2-2.2.aarch64.rpm"
RPM_HASH = "859c98b2875b0abd0e5286a46128c83b92e6aa18b9f790fba08162513b90711a9a7c79b44a7ab66b6eda8b9efe2ec420c17df6493e85722e02f4dc73ac309be2"

RPROVIDES:${PN} += "libsidplayfp-devel \
pkgconfig-libsidplayfp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsidplayfp6"

inherit rpm
