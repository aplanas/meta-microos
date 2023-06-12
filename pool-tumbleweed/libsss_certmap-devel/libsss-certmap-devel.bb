SUMMARY = "Development files for the FreeIPA certmap library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_certmap-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "e1ebc7a382b11787776d775e287a77dc782d6f289fcaa1ad165a43968c51b66cb0d61b2937e8868b9e4e3349f8346a35842c3426dfe8202ced2e01eb44f84497"

RPROVIDES:${PN} += "libsss_certmap-devel \
libsss_certmap-devel(aarch-64) \
pkgconfig(sss_certmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss_certmap0"

inherit rpm
