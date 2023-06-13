SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-ssh-agent-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "0352cbc865d5be52f2ad9118db1beaed64f5565808eef4556209e258357d90c6bd09dd73cc9eedccba8f7890f359c8576ef3eacb49fc42aceb959625596f4e4d"

RPROVIDES:${PN} += "gcr-ssh-agent \
gcr-ssh-agent(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgck-2.so.2()(64bit) \
libgcr-4.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
