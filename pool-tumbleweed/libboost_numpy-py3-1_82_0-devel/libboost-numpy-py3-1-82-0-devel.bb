SUMMARY = "Development headers for Boost.Python.NumPy library"
DESCRIPTION = "Development headers for Boost.Python.NumPy library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_numpy-py3-1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "ffbc567de67134640dba79b9cadf106c0e1f0a37c218acfe3a70f754ec097368fd568c904f1ae91589860fd4284542025f38625e8e0599bc77d884a31e572090"

RPROVIDES:${PN} += "libboost-numpy-py3-1-82-0-devel \
libboost-numpy3-devel-impl"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-numpy-py3-1-82-0"

inherit rpm
