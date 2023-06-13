SUMMARY = "Portable Windows Library from Equivalence Pty. Ltd. version 2"
DESCRIPTION = "This is a moderately large class library that was created many years \
ago as a method to produce applications that run on both Microsoft \
Windows and the X Window System."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "53fe775d49d59ee056f893e869ca3cb865f65268ee2b3a38cd05ff55b0a6f65341d94f736153a69fecb69af78435053eaa572e4e3c0b3533402ae3a09b1632c2"

RPROVIDES:${PN} += "libpt.so.2.18.8()(64bit) \
libpt2-plugins-v4l2 \
libpt2_18_8 \
libpt2_18_8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libm.so.6()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
