SUMMARY = "Developmnet files for XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library. \
 \
This package contains header files and development files."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-devel-3.1.2-1.23.aarch64.rpm"
RPM_HASH = "4bf98cd32c5373b8a5e6f8fb89f96275a53d4fe884a897cde1c63cca2303f2dc9e215dac7f9351c7f2dd8506d306111fcc0814d1a128ad5e7391a635abee58c7"

RPROVIDES:${PN} += "xbase-devel \
xbase64-devel"

RDEPENDS:${PN} += "/bin/sh \
libstdc++-devel \
xbase"

inherit rpm
