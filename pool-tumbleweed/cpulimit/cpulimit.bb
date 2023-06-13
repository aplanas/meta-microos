SUMMARY = "Limit the CPU Usage of a Process"
DESCRIPTION = "LimitCPU is a program to throttle the CPU cycles used by other applications. \
LimitCPU will monitor a process and make sure its CPU usage stays at or \
below a given percentage. This can be used to make sure your system \
has plenty of CPU cycles available for other tasks. It can also be used \
to keep laptops cool in the face of CPU-hungry processes and for limiting \
virtual machines. \
 \
LimitCPU is the direct child of CPUlimit, a creation of Angelo Marletta, \
which can be found at http://cpulimit.sourceforge.net"
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "cpulimit-3.0-1.1.aarch64.rpm"
RPM_HASH = "0747f5f8c876ab00f909a966726e0c3c594be5ba55fd02cf790b5a0c6c39fe31e8f34e516d91915f6b2ea76c10d913bf4be3cd1bcc39e23e0735dd597dd4b814"

RPROVIDES:${PN} += "cpulimit \
cpulimit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
