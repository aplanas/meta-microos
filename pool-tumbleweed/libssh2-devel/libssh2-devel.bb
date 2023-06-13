SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libssh2-devel-1.10.0-1.9.aarch64.rpm"
RPM_HASH = "b7f4443de9d6da4117660bf35fbe41fb7c034c0f467526a3bce2c85c7dab3b012819879ff0bc13921c516429129e9676f689e7704e5539b372534c61b8b87a2a"

RPROVIDES:${PN} += "libssh2-devel \
libssh2-devel(aarch-64) \
pkgconfig(libssh2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libssh2-1 \
pkgconfig(libcrypto) \
pkgconfig(libssl) \
pkgconfig(zlib)"

inherit rpm
