SUMMARY = "Portable Windows Library from Equivalence Pty. Ltd. version 2"
DESCRIPTION = "This is a moderately large class library that was created many years \
ago as a method to produce applications that run on both Microsoft \
Windows and the X Window System."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "53fe775d49d59ee056f893e869ca3cb865f65268ee2b3a38cd05ff55b0a6f65341d94f736153a69fecb69af78435053eaa572e4e3c0b3533402ae3a09b1632c2"

RPROVIDES:${PN} += "libpt.so.2.18.8 \
libpt2-18-8 \
libpt2-plugins-v4l2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
