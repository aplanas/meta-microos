SUMMARY = "Application memory usage report tool"
DESCRIPTION = "smem is a tool that can give numerous reports on memory usage on Linux \
systems. Unlike existing tools, smem can report proportional set size (PSS), \
which is a more meaningful representation of the amount of memory used by \
libraries and applications in a virtual memory system. \
 \
Because large portions of physical memory are typically shared among \
multiple applications, the standard measure of memory usage known as \
resident set size (RSS) will significantly overestimate memory usage. PSS \
instead measures each application's 'fair share' of each shared area to give \
a realistic measure."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "smem-1.5-1.9.aarch64.rpm"
RPM_HASH = "a7160fad6e2f427f16ff99de4e030443a3aa8fc7ca4ea8401323b1e69ea3441940aa50ea8fa827d6d7c702c90e1e314021f68966f19f7ba4a2fb07e8a3a43aa6"

RPROVIDES:${PN} += "smem \
smem(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python3"

inherit rpm
