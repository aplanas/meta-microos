SUMMARY = "Development package for aubio library"
DESCRIPTION = "This package contains the files needed to compile programs that use \
aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "libaubio-devel-0.4.9-10.1.aarch64.rpm"
RPM_HASH = "dacae2b9aaacc0ddcc8c016b08a860c8476c5b86a0bc11d03427e13b0dd999d3f949ea56715e72439629571c9137a1283892dea3cdce182b40f3e0d01636dfd5"

RPROVIDES:${PN} += "libaubio-devel \
pkgconfig-aubio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaubio5"

inherit rpm
