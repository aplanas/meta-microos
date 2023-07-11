SUMMARY = "Portable Windows Library from Equivalence Pty. Ltd. version 2"
DESCRIPTION = "This is a moderately large class library that was created many years \
ago as a method to produce applications that run on both Microsoft \
Windows and the X Window System."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-2.18.8-1.7.aarch64.rpm"
RPM_HASH = "b9daa48eaf33ae2246f0b16e1e220a680043764170ccc792327fa447af41c067bceb9617508aab8728438ba4a9df0fa8ab607b87fbdd092ec4ba9e360c797da7"

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
