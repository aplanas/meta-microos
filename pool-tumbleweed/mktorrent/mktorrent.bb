SUMMARY = "Command line utility to create BitTorrent metainfo files"
DESCRIPTION = "Mktorrent can be used to create BitTorrent metainfo (.torrent) files from the \
command line."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "1.1"

RPM_NAME = "mktorrent-1.1-1.21.aarch64.rpm"
RPM_HASH = "9d9a6924af60bdaf0066276856049a45e58c5e8d757aa8b8c640e5c75e92081fda9a51c723e31ad0d8c11f40a524ac10b534e4aee8771cd712b1b851e2642699"

RPROVIDES:${PN} += "mktorrent \
mktorrent(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
