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

PV = "2.9"

RPM_NAME = "cpulimit-2.9-1.1.aarch64.rpm"
RPM_HASH = "f534cc9ad9a6fa1423f03c68fd6e89853897dc40e11756142147c3e9a3e3c4efef12ca2a03fef293855b138540701212af186638541933b2bb265f581339d693"

RPROVIDES:${PN} += "cpulimit cpulimit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
