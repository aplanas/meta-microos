SUMMARY = "Linux namepaces sandbox program"
DESCRIPTION = "Firejail is a SUID sandbox program that reduces the risk of security \
breaches by restricting the running environment of untrusted applications \
using Linux namespaces and seccomp-bpf. It includes sandbox profiles for \
many existing applications like Iceweasel/Mozilla Firefox and Chromium. \
 \
Firejail also expands the restricted shell facility found in bash by adding \
Linux namespace support. It supports sandboxing specific users upon login."
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firejail-0.9.72-1.1.aarch64.rpm"
RPM_HASH = "2b9e8b4e47a06cb40cda0746bc5145002b0ad0950dc0626f27c2d73ac0124018b2bc520293be9d0970e7a0c4195fbb07574c8dd4c491d5f5c187241d368d52dc"

RPROVIDES:${PN} += "config(firejail) \
firejail \
firejail(aarch-64) \
libpostexecseccomp.so()(64bit) \
libtrace.so()(64bit) \
libtracelog.so()(64bit)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapparmor.so.1()(64bit) \
libapparmor.so.1(APPARMOR_1.1)(64bit) \
libapparmor.so.1(APPARMOR_2.11)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
permissions \
shadow"

inherit rpm
