SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "YODA-devel-1.9.7-1.3.aarch64.rpm"
RPM_HASH = "d9f1e03d506041a5faf45e280bd8dbe3e5d09999b45158f71e871837b52f7c387aca62071fa86886ab76de58d92219834b72bcb384bac4e4e54ae8640f6fb191"

RPROVIDES:${PN} += "YODA-devel \
YODA-devel(aarch-64) \
pkgconfig(yoda)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/pkg-config \
libYODA-1_9_7"

inherit rpm
