SUMMARY = "Tracing tools from the BPF Compiler Collection"
DESCRIPTION = "Python tracing scripts from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-tools-0.26.0-2.12.aarch64.rpm"
RPM_HASH = "9ca533a93f5036c759a3cc16b0908d2ea22a18474387eb08fc2a9bf6ab3e4b5667d53c4ff5ef90dbc75b80bab1879b8695069827fea09168fdff7e1a95c16402"

RPROVIDES:${PN} += "bcc-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
audit \
ld-linux-aarch64.so.1 \
libbcc-bpf.so.0 \
libbpf.so.1 \
libc.so.6 \
python3-bcc \
python3-future"

inherit rpm
