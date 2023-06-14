SUMMARY = "Development files for Allegro's logg"
DESCRIPTION = "This package is needed to build programs that use Allegro's logg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg44-devel-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "47361bd20368fc5381be4640284c347ae27a99a90503a4a5c277e2391d28ac19babf5e6bbca1aac56f7d484e8878b769104a0cbbd19fe0889de85e1b1344e8c3"

RPROVIDES:${PN} += "liblogg-devel \
liblogg44-devel \
pkgconfig-logg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogg4-4 \
pkgconfig-allegro"

inherit rpm
