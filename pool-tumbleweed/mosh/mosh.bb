SUMMARY = "The mobile shell"
DESCRIPTION = "Remote terminal application that allows roaming, supports \
intermittent connectivity, and provides intelligent local echo and \
line editing of user keystrokes. \
 \
Mosh is a replacement for SSH. It's more robust and responsive, \
especially over Wi-Fi, cellular, and long-distance links."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "mosh-1.4.0-2.2.aarch64.rpm"
RPM_HASH = "a4b8e3a11d42964417333a19b5e43467ecd45e35819c764146f83e1d36a62764bdee12b908f1f12962f4e1d67b05ea5c6a184c664c25796c26f88b87e3f1a172"

RPROVIDES:${PN} += "config-mosh \
mosh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libutempter.so.0 \
libz.so.1 \
openssh \
perl-IO-Socket-INET6 \
perl-IO-Tty"

inherit rpm
