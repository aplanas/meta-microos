SUMMARY = "Pack Program"
DESCRIPTION = "Lha is a packer comparable to ZIP (PKZIP), ZOO, and others. It has been \
included for compatibility reasons only. Use GZIP for general archiving \
purposes, because it is the standard for Linux."
LICENSE = "SUSE-Public-Domain"

PV = "1.14.1~git.20230329"

RPM_NAME = "lha-1.14.1~git.20230329-1.1.aarch64.rpm"
RPM_HASH = "fb1948c61e5d94e67d1cb1eec1403beadcc8fa5966808c76584e897113af984cd201994b91136430826eccfc3cc8c80bc3fe5d08e652ab5e136b10f98b39d260"

RPROVIDES:${PN} += "lha \
lha(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
