SUMMARY = "Featureful tar-Compatible Archiver and Compressor"
DESCRIPTION = "btar is a tar-compatible archiver which allows arbitrary compression and \
ciphering, redundancy, differential backup, indexed extraction, multicore \
compression, input and output serialisation, and tolerance to partial \
archive errors."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "btar-1.1.1-2.12.aarch64.rpm"
RPM_HASH = "6b3ff7b13672843d8ef7cdc4e916435b63e733a63dc9c3f2f7cfc2d29392adc37800eecf8ce5d49eed787820ef21202110a7c583dc371416b23c9324673107d6"

RPROVIDES:${PN} += "btar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2"

inherit rpm
