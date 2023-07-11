SUMMARY = "Development files for clingo"
DESCRIPTION = "The clingo-devel package contains libraries and header files for \
developing applications that use clingo."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "clingo-devel-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "0b466deccffbb94c3070a5182c1e92cf6bedfa76d504bc81ff12861632cbf59b0715eaa263575fab6d4a56ebcf9b4a41a505df6806c88b9fc0c007f8d5f62672"

RPROVIDES:${PN} += "clingo-devel \
cmake-Clingo"

RDEPENDS:${PN} += "clingo \
libclingo4"

inherit rpm
