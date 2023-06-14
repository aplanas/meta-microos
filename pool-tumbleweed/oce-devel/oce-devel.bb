SUMMARY = "Development files for openCASCADE"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "0.18.3"

RPM_NAME = "oce-devel-0.18.3-3.3.aarch64.rpm"
RPM_HASH = "02504277d288daab962b92854d74f4666c06ea274c6c45d4d841d7d840562dd8f3fff24113c1a5c2f64ed0c7e20d1f6fd45395dbf19588ac5f23a3baf1b43037"

RPROVIDES:${PN} += "OCE-devel \
OpenCASCADE-devel \
oce-devel"

RDEPENDS:${PN} += "oce"

inherit rpm
