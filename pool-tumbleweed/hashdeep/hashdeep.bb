SUMMARY = "Compute MD5, SHA-1, SHA-256, Tiger or Whirlpool message digests"
DESCRIPTION = "hashdeep is a program to compute, match, and audit hashsets. \
md5deep computes the MD5, SHA-1, SHA-256, Tiger, or Whirlpool message digest \
for any number of files while optionally recursively digging through the \
directory structure. md5deep can also match input files against lists of known \
hashes in a variety of formats."
LICENSE = "SUSE-Public-Domain & GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "hashdeep-4.4-5.9.aarch64.rpm"
RPM_HASH = "08eabb4babe0a17e5070137adbd55133e0753710fc9f0a88aab3e4a4dd68f73b921240047d5bd4c4033f048cc1926921bc30ed75e2105feae53bc1a7a9eae5b8"

RPROVIDES:${PN} += "hashdeep \
md5deep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
