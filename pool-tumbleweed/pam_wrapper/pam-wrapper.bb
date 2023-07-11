SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "This component of cwrap allows you to either test your PAM (Linux-PAM \
and OpenPAM) application or module. \
 \
For testing PAM applications, a simple PAM module called pam_matrix is \
included. If you plan to test a PAM module, you can use the pamtest library, \
which simplifies testing of modules. You can combine it with the cmocka \
unit testing framework, or you can use the provided Python bindings to \
write tests for your module in Python. \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "pam_wrapper-1.1.4-2.4.aarch64.rpm"
RPM_HASH = "0d22a8b736635f8814883bf826d9aafb314d070faed0358cad0160ef6880818379ad6bd5c9bb807a50b681d3a660473f1da1bd729f74817bd582d504c796251d"

RPROVIDES:${PN} += "cmake-pam-wrapper \
libpam-wrapper.so.0 \
pam-wrapper \
pkgconfig-pam-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
