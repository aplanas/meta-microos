SUMMARY = "Lightweight Download Accelerator"
DESCRIPTION = "Axel tries to accelerate HTTP/FTP downloading process by using multiple \
connections for one file. It can use multiple mirrors for a download. Axel has \
no dependencies and is lightweight, so it might be useful as a wget clone on \
byte-critical systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.11"

RPM_NAME = "axel-2.17.11-1.8.aarch64.rpm"
RPM_HASH = "ae3a13164d6abaa6acc713b7f5749c046c47a78394ba2ef0c30f168f2cd1977aa5a91fcd0c33289e0ad921839da314171eb5926dff47f2af6807a153ca7acb90"

RPROVIDES:${PN} += "axel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
