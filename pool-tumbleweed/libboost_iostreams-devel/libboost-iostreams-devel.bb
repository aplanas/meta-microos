SUMMARY = "Development headers for Boost.IOStreans library"
DESCRIPTION = "Boost.IOStreams provides a framework for defining streams, stream \
buffers and IO filters \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_iostreams-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "eb32f3c34844d8c95fe36b5c518ef0c876b8c6c5c59de2b071efb385fd8deac8c5d7f50c8c57a1cbb98d0731e2dc357f5d10f86b4af330082121f8450a7d7d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-iostreams-devel"

RDEPENDS:${PN} += "libboost-iostreams1-82-0-devel"

inherit rpm
