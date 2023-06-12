SUMMARY = "Header files for KEALib"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model. \
 \
Development Libraries for KEALib."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "KEALib-devel-1.5.0-2.3.aarch64.rpm"
RPM_HASH = "6c4291980594e8c187b2c8d8550dcf141326501cd964de30618fe09fb180a84a31b5d1173ff8cfd7acbd3d873fc294175ae02950dff04da1232aae24346f39bc"

RPROVIDES:${PN} += "KEALib-devel \
KEALib-devel(aarch-64) \
libkea-devel \
libkea1_5-devel"
RDEPENDS:${PN} += "/usr/bin/bash \
libkea1_5"

inherit rpm
