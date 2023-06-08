SUMMARY = "Tracing tools from the BPF Compiler Collection"
DESCRIPTION = "Python tracing scripts from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-tools-0.26.0-2.8.aarch64.rpm"
RPM_HASH = "e4074aeecddcd2380ba808815141ff2716241f34ac607733506cd6a40cd328a1ce21d01095593880fa444f4bbf21e0928ea188662168cc370a146eebbff1e2ce"

RPROVIDES:${PN} += "bcc-tools bcc-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 audit ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbcc_bpf.so.0()(64bit) libbpf.so.1()(64bit) libbpf.so.1(LIBBPF_0.0.1)(64bit) libc.so.6(GLIBC_2.34)(64bit) python3-bcc python3-future"

inherit rpm
