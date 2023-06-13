SUMMARY = "Maxima compiled with clisp"
DESCRIPTION = "Maxima compiled with Common Lisp."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-exec-clisp-5.46.0-1.20.aarch64.rpm"
RPM_HASH = "7914e575305e41d5cc108711c9caf02fdfe9f161f49d93770038445fe6bccd796c23ff672d8220982e34f174fef8792cb9bd3d83fbe6a6bebf5ea28183740163"

RPROVIDES:${PN} += "maxima-exec-clisp \
maxima-exec-clisp(aarch-64) \
maxima_exec"

RDEPENDS:${PN} += "clisp \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libffcall.so.0()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libsigsegv.so.2()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
