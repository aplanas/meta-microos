SUMMARY = "Graphically displays the amount of disk space used by each subdirectory"
DESCRIPTION = "xdiskusage is a user-friendly program to show you what is using \
up all your disk space. It is based on the design of xdu \
written by Phillip C. Dykstra. Changes have been made so it runs \
'du' for you, and can display the free space left on the disk, \
and produce a PostScript version of the display."
LICENSE = "GPL-2.0-only"

PV = "1.60"

RPM_NAME = "xdiskusage-1.60-1.7.aarch64.rpm"
RPM_HASH = "98365edbddbafa4af18959b1d7ae9454783179d0532582d9fdd6b9eddd6b5c3b8b295e164b94169b7cf6d8808dd3df82c2f5fdc421b3b196b2faef6c9eaeae8a"

RPROVIDES:${PN} += "xdiskusage \
xdiskusage(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfltk.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
