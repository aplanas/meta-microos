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

PV = "5.2.73"

RPM_NAME = "liblime0-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "1a41420f176fe1be4284615ca8930ec8f6b6d82769db9b1920e0306bcb6fb284228b6905a31aab6c57db0bff5c575f682ce77166c54fc7b7bb98219ee829e157"

RPROVIDES:${PN} += "liblime.so.0 \
liblime0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
