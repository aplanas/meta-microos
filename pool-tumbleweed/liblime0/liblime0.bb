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

PV = "5.2.98"

RPM_NAME = "liblime0-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ca19b337b34c22cfee49e9a10d10e1e7fd88b286c8cc0f704661210985dedba06fddc31ea3d01dd18e36f413a7e4f493b3610da52512114e8b53d9f853ef34b9"

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
