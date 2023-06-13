SUMMARY = "A high-level audio library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace1_4-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "3929923a51bf634606c3b2ca6cecd31656f364b6652f29f1f19d1c1f70fa496114ce8facd3183a0a3fc57b4a0a4044455c0d5852f821f7b5c173871664874779"

RPROVIDES:${PN} += "libaudaspace.so.1.4()(64bit) \
libaudaspace1_4 \
libaudaspace1_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
