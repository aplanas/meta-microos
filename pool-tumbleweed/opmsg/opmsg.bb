SUMMARY = "File encryption, sign and verify utility"
DESCRIPTION = "opmsg is a replacement for gpg which can encrypt/sign/verify your mails or \
create/verify detached signatures of local files. Even though the opmsg \
output looks similar, the concept is entirely different. \
 \
* Perfect Forward Secrecy (PFS) by means of ECDH or DH Kex. \
* Native EC or RSA fallback if no (EC)DH keys left. \
* Signing messages is mandatory. \
* OTR-like deniable signatures if demanded. \
* Support for 1:1 key bindings to auto-select source key per \
  destination. \
* Adds the possibility to (re-)route messages different from mail \
  address to defeat meta data collection. \
* Key format suitable for easy use with QR codes. \
* Optional cross-domain ECDH Kex."
LICENSE = "GPL-3.0-or-later"

PV = "1.78s"

RPM_NAME = "opmsg-1.78s-1.12.aarch64.rpm"
RPM_HASH = "e97be07909a94ba2f422dbef9ae373e8f66b91226764128cfd71b549637a393dc71f012c47d25359dd11e086b0212716d1dade7ebc023ae6a019e368f6d4d382"

RPROVIDES:${PN} += "opmsg"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
