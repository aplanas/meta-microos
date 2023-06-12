SUMMARY = "HardWare LiSter"
DESCRIPTION = "lshw (Hardware Lister) is a small tool to provide detailed informaton on the \
hardware configuration of the machine. It can report exact memory \
configuration, firmware version, mainboard configuration, CPU version and \
speed, cache config uration, bus speed, etc. on DMI-capable x86 systems and \
on some PowerPC machines (PowerMac G4 is known to work). \
 \
Information can be output in plain text, XML or HTML. \
 \
For detailed information on lshw features and usage, please see the \
included documentation or go to the lshw Web page, \
http://www.ezix.org/software/lshw.html"
LICENSE = "GPL-2.0-only"

PV = "B.02.19.2+git.20230320"

RPM_NAME = "lshw-B.02.19.2+git.20230320-1.1.aarch64.rpm"
RPM_HASH = "9a83fb0ab4239b1bb4d86456ce4add48a3b570e57fec104ff1b09584a430a87513e6c3ca157fd824b54cbae7cd89a0c76c109192c1ab76bff1a2b723f69a42f9"

RPROVIDES:${PN} += "lshw \
lshw(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm