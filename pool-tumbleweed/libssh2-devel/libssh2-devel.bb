SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "libssh2-devel-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "92ba5f56d6e113cb53f147fdef1d55f5a294d17083af5a7530d4d7ab69c52119a604881708ccf582c18f0b50ff3d57bf35584b60a8f564d5136cbda6033f0e4a"

RPROVIDES:${PN} += "libssh2-devel \
pkgconfig-libssh2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libssh2-1 \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-zlib"

inherit rpm
