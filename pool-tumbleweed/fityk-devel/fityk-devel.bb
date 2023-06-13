SUMMARY = "Header files, libraries and development documentation for fityk"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains libraries and header files for developing \
applications that use Fityk library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-devel-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "02422a1ad0552ec96d5cdfe7df42068f2427e71f6d360dd5173bdecd3f57be4a47df9d4a4a8aafab147d84504c99674a1b3a547e1d4760d3674b0c8f4527fd17"

RPROVIDES:${PN} += "fityk-devel \
fityk-devel(aarch-64)"

RDEPENDS:${PN} += "libfityk4"

inherit rpm
