SUMMARY = "Runtime environment for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the runtime environment for systemtap programs."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-runtime-4.9-1.1.aarch64.rpm"
RPM_HASH = "658a717da123084bfa2705900684c9a5ff4c42c0928c901b02f868c252b15ccef9b43509801ba18b4516561048a96406bc092cdd60c08995cf828660c99e8af5"

RPROVIDES:${PN} += "systemtap-runtime \
systemtap-runtime(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libelf.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
