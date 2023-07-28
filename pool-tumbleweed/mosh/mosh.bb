SUMMARY = "The mobile shell"
DESCRIPTION = "Remote terminal application that allows roaming, supports \
intermittent connectivity, and provides intelligent local echo and \
line editing of user keystrokes. \
 \
Mosh is a replacement for SSH. It's more robust and responsive, \
especially over Wi-Fi, cellular, and long-distance links."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "mosh-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "2c290d912ea2f5a429c560b34c0e6c266ef81e0d581bddddc35f843b2daf6be7bbc7ebc3a6abd057e3ffeb08069fb64cc5b19e471f0f99303114c1949318e202"

RPROVIDES:${PN} += "config-mosh \
mosh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
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
