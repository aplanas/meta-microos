SUMMARY = "LZW compression and decompression utilities"
DESCRIPTION = "The ncompress package contains the 'compress' and 'uncompress' \
utilities which are compatible with the original UNIX compress \
utility (.Z file extensions). \
 \
Install ncompress if you need compression/decompression utilities \
which are compatible with the original UNIX compress utility. gzip is \
also able to decompress .Z files, though ncompress will not recognize \
.gz files at all."
LICENSE = "SUSE-Public-Domain"

PV = "5.0"

RPM_NAME = "ncompress-5.0-1.9.aarch64.rpm"
RPM_HASH = "ef9202fa6e526a6392164ae9d83e4425ade9a414ab9ae2d7fe2ab5d3889a4efb66a40207fd8e89c884aee31508a79456b8fc5ee2744ecf869cc14aa944426571"

RPROVIDES:${PN} += "ncompress"

RDEPENDS:${PN} += "gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
