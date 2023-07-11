SUMMARY = "Linux-native fakeroot using user namespaces"
DESCRIPTION = "RootlessKit is a Linux-native implementation of 'fake root' \
using user_namespaces. RootlessKit is intended to run Docker and \
Kubernetes as an unprivileged user (known as 'Rootless mode'), so as to protect \
the real root on the host from potential container-breakout attacks."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "rootlesskit-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "c08c085d994a179514daad72d1721129e770500fbc65b05609990a1532ee528cfb9e91c665144bc6f3958f551a31c0d5cffb0788231dedc8c9a4a6540b448e1a"

RPROVIDES:${PN} += "rootlesskit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
