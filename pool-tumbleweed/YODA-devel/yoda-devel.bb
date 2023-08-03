SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.8"

RPM_NAME = "YODA-devel-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "79c6da8c6ce1b90e09a0c732ee740b338e0d07319c2c225cdfc390e4cb0ddf9868c2be838dbfc126e98e33fbdfee1affd3a6f14187620e19afcdd81b93b8081e"

RPROVIDES:${PN} += "YODA-devel \
pkgconfig-yoda"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libYODA-1-9-8"

inherit rpm
