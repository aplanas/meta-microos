SUMMARY = "The mobile shell"
DESCRIPTION = "Remote terminal application that allows roaming, supports \
intermittent connectivity, and provides intelligent local echo and \
line editing of user keystrokes. \
 \
Mosh is a replacement for SSH. It's more robust and responsive, \
especially over Wi-Fi, cellular, and long-distance links."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "mosh-1.4.0-1.8.aarch64.rpm"
RPM_HASH = "587d118b52dae3691a3fd006ce2a09b426b375222c7423739b3f341b7d268a301820fe660ac0c95da3445cef6d3814775d8722e2d7dfcf4e32b94ffd1bf4479b"

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
