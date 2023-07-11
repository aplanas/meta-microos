SUMMARY = "Compute MD5, SHA-1, SHA-256, Tiger or Whirlpool message digests"
DESCRIPTION = "hashdeep is a program to compute, match, and audit hashsets. \
md5deep computes the MD5, SHA-1, SHA-256, Tiger, or Whirlpool message digest \
for any number of files while optionally recursively digging through the \
directory structure. md5deep can also match input files against lists of known \
hashes in a variety of formats."
LICENSE = "SUSE-Public-Domain & GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "hashdeep-4.4-5.10.aarch64.rpm"
RPM_HASH = "c0baa90f593540f45d24a456cc5e524ba46159453a71184debc3065d3f9b58bdb083becec7641b05f9cccc545d1424d2e2c4eceba161f01035d0bbe325348d92"

RPROVIDES:${PN} += "hashdeep \
md5deep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
