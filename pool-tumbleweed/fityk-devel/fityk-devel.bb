SUMMARY = "Header files, libraries and development documentation for fityk"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains libraries and header files for developing \
applications that use Fityk library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "f64b076f27c86e32558720097f4102323b7e29e4d8736c1f6acc3c66c5169135374073a5f2c742d8972956fc4b0c93a8ce69ff2967fabaf787ae36df6fe29d16"

RPROVIDES:${PN} += "fityk-devel"

RDEPENDS:${PN} += "libfityk4"

inherit rpm
