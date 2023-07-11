SUMMARY = "Tracing tools from the BPF Compiler Collection"
DESCRIPTION = "Python tracing scripts from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-tools-0.26.0-2.11.aarch64.rpm"
RPM_HASH = "5270c6649b8ee85155957f8482b252ac60d025285d171840ae8e7d4105f89e6980fe5d9e2ce04f62ae880aa937d81f31e732ce02304f46c8e737899a830c1741"

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
