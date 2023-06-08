SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-d-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "30c16e31b81c8a7951aa8963b523cca4bda89986b10f9cb7f2de4723b76a52bf29a376667aca4dd7e456bf6aabd1be105855ba5d26dee05dab62acd21f33d2af"

RPROVIDES:${PN} += "gcc11-d gcc11-d(aarch-64)"
RDEPENDS:${PN} += "gcc11 libc.so.6(GLIBC_2.34)(64bit) libgdruntime2 libgmp.so.10()(64bit) libgphobos2 libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
