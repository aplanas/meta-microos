SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the source files for development with YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "YODA-devel-1.9.7-1.4.aarch64.rpm"
RPM_HASH = "90b7522c06d57b69ef7cf187df4b2b4c19196a7bfbc90cb93284f3111179f1223e8e28e29cf6bfd14bffc31d3713640d77fa53c3fea66e6908d1daf2d6b4620b"

RPROVIDES:${PN} += "YODA-devel \
pkgconfig-yoda"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libYODA-1-9-7"

inherit rpm
