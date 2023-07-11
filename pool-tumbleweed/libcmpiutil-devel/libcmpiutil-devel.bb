SUMMARY = "Library of utility functions for CMPI providers"
DESCRIPTION = "Libcmpiutil is a library of utility functions for CMPI providers.  The \
goal is to reduce the amount of repetitive work done in most CMPI \
providers by encapsulating common procedures with more 'normal' APIs. \
This extends from operations like getting typed instance properties to \
standardizing method dispatch and argument checking."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.7"

RPM_NAME = "libcmpiutil-devel-0.5.7-9.4.aarch64.rpm"
RPM_HASH = "bffef58d36d39ef4e6fccb3aa224c00dbc523fc83d5d236060d90dc89e36cb19416e2b26e534b006568b3ec846e29f08578321469649e427920fa780c9d01aaa"

RPROVIDES:${PN} += "libcmpiutil-devel \
pkgconfig-libcmpiutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmpiutil0 \
sblim-cmpi-devel"

inherit rpm
