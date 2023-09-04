SUMMARY = "Utilities to work with .solv files"
DESCRIPTION = "libsolv is a library for solving packages and reading repositories. \
 \
This subpackage contains utilities to create and work with the .solv \
files used by libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-tools-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "e370aea0c6a4983757baa8d1f2bda11c172f2dd8a02ee821fdb4e019f95dd3900ef20cacbe0382e53cb0a73c2c415d46d5e44cced693f4d7345d07be5fe1546b"

RPROVIDES:${PN} += "libsolv-tools \
satsolver-tools"

RDEPENDS:${PN} += "findutils \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
