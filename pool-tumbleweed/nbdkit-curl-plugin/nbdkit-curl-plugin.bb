SUMMARY = "HTTP/FTP (cURL) plugin for nbdkit"
DESCRIPTION = "This package contains cURL (HTTP/FTP) support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-curl-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "86844f746cccbafcd9db4a30ca4372f5459b1645ebaca03ef32c448fa36eae9326cce5a94b685b6ed20d5c2ae455c4eb02b7b1e580fac001de7a7d92f69c872d"

RPROVIDES:${PN} += "nbdkit-curl-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
nbdkit-server"

inherit rpm
