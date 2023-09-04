SUMMARY = "File indexer for accelerated search using ugrep"
DESCRIPTION = "The ugrep-indexer utility recursively indexes files to accelerate recursive \
searching on file systems with ugrep."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "ugrep-indexer-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "d558b464bab56e1d76d101a19fba6d551cd58bd7556b723fd8657f72a0d54403bf747187be6cd73295127ee46c2831bf13b488e89204128c6981c7b9c7b799a7"

RPROVIDES:${PN} += "ugrep-indexer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
