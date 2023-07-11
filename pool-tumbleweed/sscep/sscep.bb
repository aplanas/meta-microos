SUMMARY = "A command line client for the SCEP protocol"
DESCRIPTION = "Simple SCEP (Simple Certificate Enrollment Protocol) client with \
modifications for engine support & more."
LICENSE = "BSD-3-Clause-Attribution & OpenSSL"

PV = "0.10.0"

RPM_NAME = "sscep-0.10.0-1.9.aarch64.rpm"
RPM_HASH = "354ed16b333dbf0ae3f5fbfd15c26b82fdc06848bb941be0da6592dc55f812b39b1e532dff3c2b5b533e5c61c7d3fa0caf9f7cfa3d6ca24deb692307cc353f65"

RPROVIDES:${PN} += "config-sscep \
sscep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
