SUMMARY = "Header-only C++ binding for libzmq"
DESCRIPTION = "cppzmq is a header-only C++ binding for libzmq."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "cppzmq-devel-4.8.1-1.5.aarch64.rpm"
RPM_HASH = "ae38cde23710c3357504341e2e25bd14ffb07f94d6ff0d4a15a15138de10d3be81fa211c2707e61c43285089d8e192dbedde35e81bb422ef2dd2b875cfbdd868"

RPROVIDES:${PN} += "cmake(cppzmq) \
cppzmq-devel \
cppzmq-devel(aarch-64)"
RDEPENDS:${PN} += "pkgconfig(libzmq)"

inherit rpm
