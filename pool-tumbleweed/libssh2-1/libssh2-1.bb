SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libssh2-1-1.10.0-1.9.aarch64.rpm"
RPM_HASH = "e57d3042137ccaee5d541639bc4d1c380743be0d386982b46b190441fe41bf08daa9d75f0eba0e0a225bb61b37d979edd192c41f1a3851eaf6932031951798ea"

RPROVIDES:${PN} += "libssh2-1 \
libssh2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libz.so.1"

inherit rpm
