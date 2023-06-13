SUMMARY = "Python bindings to Fityk library"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains python bindings to Fityk library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "python3-fityk-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "315c095d92372d93db476bab40ae6241f92cab8b0fc9bbae367aa475b69794e8494da9b0a35e278d36a6e1ba64ce9ad3b9e64789e6d4b6fbb573d39a3bf96278"

RPROVIDES:${PN} += "python3-fityk \
python3-fityk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfityk.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
