SUMMARY = "Development files for futuresql"
DESCRIPTION = "This package contains development files needed to use futuresql."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "futuresql-qt5-devel-0.1.1-1.1.aarch64.rpm"
RPM_HASH = "b6490f31368ba5a69c23de8004911d39e4c625a6667861604ff829e6c800018bd7653dd3a3715dc431d3c47dbc1e86a1182411f2ff6305a4ac2dec135eb7aa19"

RPROVIDES:${PN} += "cmake-FutureSQL5 \
futuresql-qt5-devel"

RDEPENDS:${PN} += "libfuturesql5-0"

inherit rpm
