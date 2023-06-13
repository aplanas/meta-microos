SUMMARY = "Instant Message End-to-End Encryption Library"
DESCRIPTION = "LIME is an encryption library for one-to-one and group instant \
messaging, allowing users to exchange messages privately and \
asynchronously. It supports multiple devices per user and multiple \
users per device. \
 \
LIME offers two major security benefits to instant messaging users: \
  * End-to-end encryption, which means that only you and your \
    contact (and not even the server) can decrypt the content that \
    you shared. \
  * Perfect forward secrecy, which ensures that encrypted messages \
    cannot be decrypted by a third party, even if a key is \
    compromised in the future."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "liblime0-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "1adf079f9362b6e4013ba5f20f5ebfcf6073aec9709f84722a29e681ca84d2723d9cc12b40e65e5e607bc5f7841cebe4ed595f11a9ee900d1c6e43ee3b9a73e7"

RPROVIDES:${PN} += "liblime.so.0()(64bit) \
liblime0 \
liblime0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox.so.1()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
