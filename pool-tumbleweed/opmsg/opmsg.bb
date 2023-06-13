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

RPM_NAME = "opmsg-1.78s-1.11.aarch64.rpm"
RPM_HASH = "8438076f7b799932bd49fa24f36bad4a20638e33dfa155a121bb72e43910b96f4ece6ff2bfcf76651999cc8699004aa81d7239a9880b6892b7d2856a236a4477"

RPROVIDES:${PN} += "opmsg \
opmsg(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
