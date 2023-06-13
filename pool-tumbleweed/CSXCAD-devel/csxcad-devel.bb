SUMMARY = "Development files for CSXCAD"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package contains libraries and header files for developing \
applications that use CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "CSXCAD-devel-0.6.2-3.19.aarch64.rpm"
RPM_HASH = "ce6b892be5fade9daf8991bfc6fd40143cb289c0f5cc7e30aa682f54f6a30939addb470dac05433144c4407aaa20bd382124969e7027ec432f6fe2cfa2f31344"

RPROVIDES:${PN} += "CSXCAD-devel \
CSXCAD-devel(aarch-64)"

RDEPENDS:${PN} += "libCSXCAD0"

inherit rpm
