SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "libsphinxad0-0.8-6.7.aarch64.rpm"
RPM_HASH = "aa46b95b720adab69de3967b547f6517a3f99f2a25d257a12e088bd5e0253231b2199df9160043128c89308ad452e3a2ac3609707777955bed16e6ab6e4f6e9f"

RPROVIDES:${PN} += "libsphinxad.so.0 \
libsphinxad0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsphinxbase.so.1"

inherit rpm
