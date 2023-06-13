SUMMARY = "Process Environment Dump Tool"
DESCRIPTION = "procenv is a tool that dumps all attributes of its environment. It can be run \
as a test tool, to understand what environment a process runs in and for system \
comparison."
LICENSE = "GPL-3.0-or-later"

PV = "0.60"

RPM_NAME = "procenv-0.60-1.10.aarch64.rpm"
RPM_HASH = "963ce8cdd9f9cb78d3f0f2f5be526322ed175652ab16160fa834226d71607c1b9d28345311e618c5de94532db3a4230ba3d5b9ff16c07b5c0a64fe3422d2754b"

RPROVIDES:${PN} += "procenv \
procenv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libnuma.so.1()(64bit)"

inherit rpm
