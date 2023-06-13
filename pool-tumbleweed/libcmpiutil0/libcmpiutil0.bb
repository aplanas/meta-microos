SUMMARY = "Library of utility functions for CMPI providers"
DESCRIPTION = "Libcmpiutil is a library of utility functions for CMPI providers.  The \
goal is to reduce the amount of repetitive work done in most CMPI \
providers by encapsulating common procedures with more 'normal' APIs. \
This extends from operations like getting typed instance properties to \
standardizing method dispatch and argument checking."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.7"

RPM_NAME = "libcmpiutil0-0.5.7-9.3.aarch64.rpm"
RPM_HASH = "fbbb4ea6da3e7568f2d1bb943e1ddaf5cf74893e6bf1eae7f85e54327467e621c0850cc476367983c9c8242009af5b897603ec12fcd50d7e169382a0f24b8fde"

RPROVIDES:${PN} += "libcmpiutil.so.0()(64bit) \
libcmpiutil0 \
libcmpiutil0(aarch-64) \
libcueoparser.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
