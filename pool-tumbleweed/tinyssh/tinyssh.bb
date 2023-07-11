SUMMARY = "A minimalistic SSH server which implements only a subset of SSHv2 features"
DESCRIPTION = "tinyssh is a minimalistic SSH server which implements only a subset of SSHv2 \
features. It supports only secure cryptography (minimum 128-bit security, \
protected against cache-timing attacks) and doesn't implement unnecessary \
features (such as SSH1 protocol, compression, ...) or older crypto (such as \
RSA, DSA, HMAC-MD5, HMAC-SHA1, 3DES, RC4, ...). tinysshd doesn't implement \
unsafe features (such as password or hostbased authentication) or doesn't \
use dynamic memory allocation (no allocation failures, etc.)"
LICENSE = "CC0-1.0"

PV = "20230101"

RPM_NAME = "tinyssh-20230101-1.3.aarch64.rpm"
RPM_HASH = "28f06008a9b5eabf4dcd1435dd394356cd7b90eb353bcdde213f86d695969850da481fffbd407f69983a9edc39ff6d81137fabf391f09cec117e73ac113a98b8"

RPROVIDES:${PN} += "tinyssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
