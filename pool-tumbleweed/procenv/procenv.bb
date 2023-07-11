SUMMARY = "Process Environment Dump Tool"
DESCRIPTION = "procenv is a tool that dumps all attributes of its environment. It can be run \
as a test tool, to understand what environment a process runs in and for system \
comparison."
LICENSE = "GPL-3.0-or-later"

PV = "0.60"

RPM_NAME = "procenv-0.60-1.11.aarch64.rpm"
RPM_HASH = "b66e22a88cf9f617d1f22e6200323b930b539e7b0a5dc871137acd5b161cd952e685a859612599c3a1f1065ace905412eceeb18713db2e194c233dbdaf8c9f92"

RPROVIDES:${PN} += "procenv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libnuma.so.1"

inherit rpm
