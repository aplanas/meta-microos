SUMMARY = "Linux-native fakeroot using user namespaces"
DESCRIPTION = "RootlessKit is a Linux-native implementation of 'fake root' \
using user_namespaces. RootlessKit is intended to run Docker and \
Kubernetes as an unprivileged user (known as 'Rootless mode'), so as to protect \
the real root on the host from potential container-breakout attacks."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "rootlesskit-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "e43f4a2f1c64bd9e8debdefb8ea204ef12e64fc261ac9da1a6ae550ab7d9469301bf32ad42af0069c4bb6ebf06ef96959543b83bda930fe6b459027fb3debd43"

RPROVIDES:${PN} += "rootlesskit \
rootlesskit(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
