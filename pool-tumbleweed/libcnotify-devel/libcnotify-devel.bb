SUMMARY = "Development files for libcnotify, a C notify library"
DESCRIPTION = "A library for C notify functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcnotify."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcnotify-devel-20220108-3.2.aarch64.rpm"
RPM_HASH = "4dd6620e075834737ee55b0abffc1ce948a5af1b6e1fae698ac9698e12727d794dfd4e48faf2b0ffb05eca1ea85f650a0fc643aa7ad1ad1ba030c727b2c9a9e5"

RPROVIDES:${PN} += "libcnotify-devel \
pkgconfig-libcnotify"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcnotify1"

inherit rpm
