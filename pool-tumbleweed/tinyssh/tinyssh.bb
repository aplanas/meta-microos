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

RPM_NAME = "tinyssh-20230101-1.2.aarch64.rpm"
RPM_HASH = "53e179939094be2831b3b0c0cb0b92de903ad871eff23b416f4e798f64c3e92330376160601ba850bbded5774e0836f91dbb45b52c1053f6d58838aed946daf4"

RPROVIDES:${PN} += "tinyssh \
tinyssh(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
