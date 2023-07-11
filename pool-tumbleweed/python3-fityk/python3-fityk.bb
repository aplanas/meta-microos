SUMMARY = "Python bindings to Fityk library"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains python bindings to Fityk library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "python3-fityk-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "a8753d5915720866a26be0b863a07017faa2e11cdca8824429496ed1e14c306f3453498388a7c213684f90631af9284af054cb764722fe52328d1cbdd51fde2f"

RPROVIDES:${PN} += "python3-fityk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfityk.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
