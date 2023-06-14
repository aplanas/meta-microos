SUMMARY = "A powerful duplicate file finder and an enhanced fork of 'fdupes'"
DESCRIPTION = "A program for identifying and taking actions upon duplicate files. \
 \
A WORD OF WARNING: jdupes IS NOT a drop-in compatible replacement for fdupes! \
Do not blindly replace fdupes with jdupes in scripts and expect everything to \
work the same way. Option availability and meanings differ between the two \
programs."
LICENSE = "MIT"

PV = "1.21.3"

RPM_NAME = "jdupes-1.21.3-1.3.aarch64.rpm"
RPM_HASH = "935025fe3f737cb4c499f7d5da1b391829fa1967ae4244f63c6b9c158fe1cbe73b82d6b3880226c1ff67aa5db1838ae709bd3588a8e3cda31e60cfe8163795fd"

RPROVIDES:${PN} += "jdupes \
rpm-macro-fdupes \
rpm-macro-suse-hardlink-dupes \
rpm-macro-suse-symlink-dupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
