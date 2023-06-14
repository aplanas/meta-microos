SUMMARY = "Low Complexity Communication Codec (LC3) - Tools"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides tools for liblc3."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "liblc3-tools-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "ced923244056012dabbff676c9895e6dfd82f186b816a4779eaf5c93659700dba0a933a97f78895f2b53360c37172dc4c93a140ef6829b109fb4a787932e9c28"

RPROVIDES:${PN} += "liblc3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblc3.so.1"

inherit rpm
