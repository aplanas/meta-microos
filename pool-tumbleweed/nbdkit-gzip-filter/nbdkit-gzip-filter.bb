SUMMARY = "GZip filter for nbdkit"
DESCRIPTION = "This package is a gzip filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-gzip-filter-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "ad3b2ba2e9719dbfb08d6985a41ec496108e9d0091ad5ac05944f805e6585fb49e432faee15261b5764f46c9dc29162a800b32764efd5f9ebefcdb543b4fb47a"

RPROVIDES:${PN} += "nbdkit-gzip-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
nbdkit-server"

inherit rpm
