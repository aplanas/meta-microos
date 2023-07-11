SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "libssh2-1-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "ea3cae4724daae698757d0713251130284f1bc880c6677bffbbc91906deccbb738aa0011d933caa989b6944ba0e1986450a029227cdb4b03cdf69df7ea5054bd"

RPROVIDES:${PN} += "libssh2-1 \
libssh2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libz.so.1"

inherit rpm
