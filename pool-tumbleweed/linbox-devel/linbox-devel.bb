SUMMARY = "Development files for LinBox, a library for computation over finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields. \
 \
This subpackage contains the include files and library links for \
developing against the Givaro library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.0"

RPM_NAME = "linbox-devel-1.7.0-1.8.aarch64.rpm"
RPM_HASH = "7b470475b77e327662c1c7b0c9f4870743ddcc728abd78a451fc8de0ff063ee79a203d91f0de81e30bcbd77b31d07094c437774ac3ab6bf321e209eda8badf2f"

RPROVIDES:${PN} += "linbox-devel \
pkgconfig-linbox"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
liblinbox0 \
pkgconfig-fflas-ffpack"

inherit rpm
