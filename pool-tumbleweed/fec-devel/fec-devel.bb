SUMMARY = "Development files for the libfec library"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfec."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "fec-devel-3.0.0+git.20160910-5.3.aarch64.rpm"
RPM_HASH = "9f857ab946d38ae918d951fbdc6c03c1595f96d7f5d7dec5702093bb07f4e2568add199e36d093d4b1bebdcbb5407d3b4117b44e992060030460f96cae937b82"

RPROVIDES:${PN} += "fec-devel \
fec-devel(aarch-64) \
pkgconfig(libfec)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfec3"

inherit rpm
