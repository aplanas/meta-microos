SUMMARY = "Tests for the package"
DESCRIPTION = "Upstream testsuite for the package"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-tests-1.34-10.3.aarch64.rpm"
RPM_HASH = "ce56908fffb632d2709cde43a5cf05e30c430363d98a220cf7038822243c58ef48a7531fbebc0f4ca10e3d30b8e049c2a1d4bcc6fd4e1b1433e9f9c5a0b43f19"

RPROVIDES:${PN} += "tar-tests \
tar-tests(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
tar"

inherit rpm
