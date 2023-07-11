SUMMARY = "The mobile shell"
DESCRIPTION = "Remote terminal application that allows roaming, supports \
intermittent connectivity, and provides intelligent local echo and \
line editing of user keystrokes. \
 \
Mosh is a replacement for SSH. It's more robust and responsive, \
especially over Wi-Fi, cellular, and long-distance links."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "mosh-1.4.0-1.9.aarch64.rpm"
RPM_HASH = "a24b57288195a0dc2d16fb1a3c998b440ad0249ee43aeb0dfe677c39043f8662e92dbb45c12e8a84e5883ece035771d390c3f79afc0d5ffa9a63127bf7b0bacf"

RPROVIDES:${PN} += "config-mosh \
mosh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libtinfo.so.6 \
libutempter.so.0 \
libz.so.1 \
openssh \
perl-IO-Socket-INET6 \
perl-IO-Tty"

inherit rpm
