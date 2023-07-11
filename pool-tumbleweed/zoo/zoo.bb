SUMMARY = "Pack Program"
DESCRIPTION = "Zoo is a packer based on the Lempel-Ziv algorithm. Lots of files on \
DOS/AmigaDOS and TOS systems used this packer for their archives. The \
compression rate of gzip is not reached, and thus zoo should only be used \
for decompressing old archives."
LICENSE = "SUSE-Public-Domain"

PV = "2.10"

RPM_NAME = "zoo-2.10-1027.13.aarch64.rpm"
RPM_HASH = "43ebfa5e458fc46d529cc3789eaefc6f83f628b3ca425860b8845246e2d5aff671b44e7009f5ce863e2ef52311102d5eefef9cfc974295065c54bb6144c13098"

RPROVIDES:${PN} += "zoo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
