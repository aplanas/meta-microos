SUMMARY = "Ceph ZBC handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS ZBC disc emulation, using a \
file backstore in tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-zbc-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "5064d5d713ce47e19e55db093aac17589e4379efab83739f355adb7aedee88ebffd1b0992a18f2895d0bc17eaad22cf74b1ba4c0195484b2ef8f43186b26b115"

RPROVIDES:${PN} += "tcmu-runner-handler-zbc \
tcmu-runner-handler-zbc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtcmalloc.so.4()(64bit) \
tcmu-runner"

inherit rpm
