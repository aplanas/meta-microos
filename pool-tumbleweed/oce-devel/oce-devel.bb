SUMMARY = "Development files for openCASCADE"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "0.18.3"

RPM_NAME = "oce-devel-0.18.3-3.4.aarch64.rpm"
RPM_HASH = "918e01b5d7c315c26ed0f8dee845b266a0d04f2fe2ddfe99a4fd293c271551e968f7d1ff2f84e8e9b453b0938cdc5348d687bf6fd879f5bc78db0f93e3465c75"

RPROVIDES:${PN} += "OCE-devel \
OpenCASCADE-devel \
oce-devel"

RDEPENDS:${PN} += "oce"

inherit rpm
