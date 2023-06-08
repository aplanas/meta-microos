SUMMARY = "Modifies the dynamic library load path of compiled programs and libraries"
DESCRIPTION = "Chrpath allows you to modify the dynamic library load path (rpath and \
runpath) of compiled programs. Currently, only removing and modifying the \
rpath is supported. It cannot extend or add an rpath."
LICENSE = "GPL-2.0-or-later"

PV = "0.16"

RPM_NAME = "chrpath-0.16-5.12.aarch64.rpm"
RPM_HASH = "efbe49e054f66bf2aefa077646e8ade40f255612016bd7e84a212a48b11ba9f40d8ac72c7a7f7051379695dbdf9d6d63dc34f5b3d51d53f928561075f6878064"

RPROVIDES:${PN} += "chrpath chrpath(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
