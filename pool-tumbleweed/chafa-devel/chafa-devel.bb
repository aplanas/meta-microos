SUMMARY = "Development files for chafa"
DESCRIPTION = "Development files for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.5"

RPM_NAME = "chafa-devel-1.12.5-1.1.aarch64.rpm"
RPM_HASH = "27379c044167ef640050ea45c3d50f89663fa16bdc17d9fa8bd790655a4c0859c70976f4ab7aefc50dba95faa7686373311df16d86a6dfcc6bff9946700f17b2"

RPROVIDES:${PN} += "chafa-devel \
chafa-devel(aarch-64) \
pkgconfig(chafa)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchafa0 \
pkgconfig(glib-2.0)"

inherit rpm
