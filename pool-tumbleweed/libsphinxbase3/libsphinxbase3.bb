SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "libsphinxbase3-5~git20220609.617e536-1.4.aarch64.rpm"
RPM_HASH = "22d2d44631e54df5d8f483f805d6ea279787ea10ffc5b2f97b392fc7e4090181bd00dd4e9a9868d515c5559fbc4a665c79af1e61306aa9df56b6ce0369adba3e"

RPROVIDES:${PN} += "libsphinxad.so.3 \
libsphinxbase.so.3 \
libsphinxbase3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
