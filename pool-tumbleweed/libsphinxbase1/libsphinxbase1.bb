SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "libsphinxbase1-0.8-6.7.aarch64.rpm"
RPM_HASH = "674c50273fe5719ecfe394d99d696ddcfc837f6b0ae494d0ce792a1a41c371cd0e182dc5aecb4c9d6f65749342bcf24dc7013d2d041d0b558533ff48d89b1342"

RPROVIDES:${PN} += "libsphinxbase.so.1 \
libsphinxbase1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
