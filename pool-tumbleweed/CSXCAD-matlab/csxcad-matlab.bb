SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides MATLAB interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "CSXCAD-matlab-0.6.2-3.20.noarch.rpm"
RPM_HASH = "3eee38239b30e81a017de371ede23943dc9fade365b84e417d24e2dd7dc2e83ae6b68db02a17f2ef47d7c7264630cc142228e7a13c51d1d85fd40ddbdfdac99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "CSXCAD-matlab"

RDEPENDS:${PN} += ""

inherit rpm
