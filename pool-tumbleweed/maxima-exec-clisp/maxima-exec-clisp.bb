SUMMARY = "Maxima compiled with clisp"
DESCRIPTION = "Maxima compiled with Common Lisp."
LICENSE = "GPL-2.0-or-later"

PV = "5.47.0"

RPM_NAME = "maxima-exec-clisp-5.47.0-1.3.aarch64.rpm"
RPM_HASH = "0d7267bad1724235c7725c689c668b1907088d5f2f3e0a7d9bbcea1500e5795dfa84250f26109e44673b535257666870868870372705804e43359b9ae18b2c48"

RPROVIDES:${PN} += "maxima-exec \
maxima-exec-clisp"

RDEPENDS:${PN} += "clisp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libffcall.so.0 \
libm.so.6 \
libreadline.so.8 \
libsigsegv.so.2 \
libtinfo.so.6"

inherit rpm
