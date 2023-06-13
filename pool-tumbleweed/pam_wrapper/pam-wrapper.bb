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

RPM_NAME = "pam_wrapper-1.1.4-2.3.aarch64.rpm"
RPM_HASH = "3acb061cbd1f2236e500b0a26cb39b8578417b3c74716873fab4ff65482682c62e20a9482a4f66a6ce049ea8b226f4d6403593f6beba3d263a769f4f69f2f898"

RPROVIDES:${PN} += "cmake(pam_wrapper) \
libpam_wrapper.so.0()(64bit) \
pam_wrapper \
pam_wrapper(aarch-64) \
pkgconfig(pam_wrapper)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpam.so.0()(64bit)"

inherit rpm
