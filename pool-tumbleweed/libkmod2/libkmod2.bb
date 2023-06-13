SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod2-30-3.1.aarch64.rpm"
RPM_HASH = "11894887ffe91f1e0167063a9b3d5512d292551b37e099a795f5343a93d0898e647257ffdab5a085447b4d74f02eeae9e09d035b1c7949187da67f6df42af5a1"

RPROVIDES:${PN} += "libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_22)(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
libkmod.so.2(LIBKMOD_6)(64bit) \
libkmod2 \
libkmod2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
liblzma.so.5()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
