SUMMARY = "Utility to list interned atoms defined on an X11 server"
DESCRIPTION = "xlsatoms lists the interned atoms defined on an X11 server."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xlsatoms-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "a9a3e2b30d15d91059b0cb05a17eb89a18a568538f108fd7a86150219c9ff2a826456ad0b1fbc65bf73ec2f559c26a91d77917ba5a4ee956ad3b9aa01aa4037a"

RPROVIDES:${PN} += "xlsatoms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
