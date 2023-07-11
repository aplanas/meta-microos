SUMMARY = "Library of utility functions for CMPI providers"
DESCRIPTION = "Libcmpiutil is a library of utility functions for CMPI providers.  The \
goal is to reduce the amount of repetitive work done in most CMPI \
providers by encapsulating common procedures with more 'normal' APIs. \
This extends from operations like getting typed instance properties to \
standardizing method dispatch and argument checking."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.7"

RPM_NAME = "libcmpiutil0-0.5.7-9.4.aarch64.rpm"
RPM_HASH = "0fb1adbabef01b6d8702c1453d263b6b78b355594c117f2a8801db55d239a31826b7d7e3f08e9fa984b65dca9d2811c00ce8f47a6461bb6f87791e6e28c48d49"

RPROVIDES:${PN} += "libcmpiutil.so.0 \
libcmpiutil0 \
libcueoparser.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
