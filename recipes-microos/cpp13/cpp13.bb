SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cpp13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "f81da5feb6b8dc5dae015f050fdb79769cad95dcb961245261b7b61ec095cc262100f2512c6c0f2d7289293497bc2fdbb8ac318fa724210ce478a7841675c833"

RPROVIDES:${PN} += "cpp13 cpp13(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
