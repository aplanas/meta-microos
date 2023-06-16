SUMMARY = "Tracing tools from the BPF Compiler Collection"
DESCRIPTION = "Python tracing scripts from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-tools-0.26.0-2.10.aarch64.rpm"
RPM_HASH = "8553782cea0eadc9e822fb2822096179c68554c84f2b8d21700607d78282867a27c6ca458ff9398ee4d1318f74c94c839274a5b1b025a62a35548ff236a56304"

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
