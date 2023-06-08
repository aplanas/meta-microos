SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cpp7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "dc5fdc7c86e495b3f21e661d55879698df13e72978f6a1a3d9a04f2a1d01c40785bb1db635102e1ca47c320f0dfb2ec13c14a79661e6a4fc35b34fca08101ad0"

RPROVIDES:${PN} += "cpp7 cpp7(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
