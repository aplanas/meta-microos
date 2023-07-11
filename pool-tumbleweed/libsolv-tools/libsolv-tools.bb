SUMMARY = "Utilities to work with .solv files"
DESCRIPTION = "libsolv is a library for solving packages and reading repositories. \
 \
This subpackage contains utilities to create and work with the .solv \
files used by libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-tools-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "51a38784b54223807a51444005756666626c0c683bc9fe4abe197d56024bc093b0fd421dce24c7e881f5ee362bcfb17827782140abde42df7ed46e0e7252c90a"

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
