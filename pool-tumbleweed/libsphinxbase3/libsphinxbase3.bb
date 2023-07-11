SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "5~git20220609.617e536"

RPM_NAME = "libsphinxbase3-5~git20220609.617e536-1.5.aarch64.rpm"
RPM_HASH = "b611f45a0f437a0308162eb81057b2ada626515d65f6cbd2c0393723c450378c97e3cfaebbec3ddd3fddc781a0e28218675c60ff6769b35d9e5f3210483432d2"

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
