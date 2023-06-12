SUMMARY = "Shared libraries for cal3d"
DESCRIPTION = "Cal3D is a skeletal based 3D character animation library written \
in C++ in a platform-/graphic API-independent way. Originally \
designed to be used in a 3D client for Worldforge, it evolved \
into a stand-alone product which can be used in many different \
kinds of projects. It supports combining animations and actions \
through a 'mixer' interface, and work is currently underway to \
integrate morph targets (interpolating between one mesh and \
another, using the same vertex sequence) easily into the system. \
 \
This package contains the shared libraries for cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "libcal3d12-0.120-3.10.aarch64.rpm"
RPM_HASH = "7de6f8f46dcafbaefc6fcbfe5b3641c6fe929fa302b60cebe26322f1526ac31466b453f3687b1aa555dd410acc3ff9c7519d2c2ad7e28742e997f153f76a8853"

RPROVIDES:${PN} += "libcal3d.so.12()(64bit) \
libcal3d12 \
libcal3d12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
