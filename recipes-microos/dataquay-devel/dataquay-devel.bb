SUMMARY = "Development files for dataquay, an RDF data store library"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt5 classes and containers. \
 \
This subpackage contains the header files for developing \
applications that want to make use of dataquay."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "dataquay-devel-0.9.1-2.22.aarch64.rpm"
RPM_HASH = "4809e9ca39763affc466dc357ba3343e60ed227f5455f61480c9b185d158eaccebbe6ca66ebc12649fb855291fd503e5ffcaf67221b7ebb836cc3548963d525e"

RPROVIDES:${PN} += "dataquay-devel \
dataquay-devel(aarch-64) \
pkgconfig(dataquay)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdataquay0"

inherit rpm
