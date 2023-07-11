SUMMARY = "Developmnet files for XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library. \
 \
This package contains header files and development files."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-devel-3.1.2-1.24.aarch64.rpm"
RPM_HASH = "bf46d73b7797d33e93412911556ed404b6b617c2c5c144e8c0ddb763cb96fd1ba41b24dc7a8d4e37a7d7edc579bac768cf5d81f362c50951bd7cc32821e82b08"

RPROVIDES:${PN} += "xbase-devel \
xbase64-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libstdc++-devel \
xbase"

inherit rpm
