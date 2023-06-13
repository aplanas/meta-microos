SUMMARY = "PLplot functions for scientific plotting with Java"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Java."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-java-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "0242caa06d8358653c68da0137b6f77f3025987344f229de74eb0e586ef82125ad3db495d0c78702b221b3ecf3f6a787ead0399d8ea65acdc6e013bbbd70bc20"

RPROVIDES:${PN} += "libplplotjavac_wrap.so()(64bit) \
plplot-java \
plplot-java(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libplplot.so.17()(64bit) \
plplot-common"

inherit rpm
