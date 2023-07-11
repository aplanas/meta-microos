SUMMARY = "Header files for KEALib"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model. \
 \
Development Libraries for KEALib."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "KEALib-devel-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "c44f5e5eadf7a597ffb8a3102c70ecfc2692ff8efb05ae453393d50ed4f3fdcecd3beb79b47256894b76519c80c3f2ffa7780db3325da3a768b6de1a2722fcee"

RPROVIDES:${PN} += "KEALib-devel \
libkea-devel \
libkea1-5-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libkea1-5"

inherit rpm
