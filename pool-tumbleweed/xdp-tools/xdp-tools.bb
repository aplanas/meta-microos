SUMMARY = "Utilities and example programs for use with XDP"
DESCRIPTION = "Utilities and example programs for use with XDP"
LICENSE = "GPL-2.0"

PV = "1.3.1"

RPM_NAME = "xdp-tools-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "d02efeb611440aa88073df4d5a7a6f3037c95f86dfaf439a0ca027e99802e562b8a110c45d045f612d76e5ac2330321216ec72af0e23996c0e091f77a401f2f8"

RPROVIDES:${PN} += "xdp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libpcap.so.1 \
libxdp.so.1 \
libxdp1"

inherit rpm
