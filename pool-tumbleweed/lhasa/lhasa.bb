SUMMARY = "Program to unpack LHARC archives"
DESCRIPTION = "Lhasa is a replacement for the Unix LHA tool, for decompressing \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.4.0"

RPM_NAME = "lhasa-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "9ecfba9a5581c1a0c0535cac79ac17b5aa35e2a9b2e38987d4df0627430354999f4038a0083d488d0d0102667baee5c70aabb4039b398198966912520e374a3b"

RPROVIDES:${PN} += "lhasa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblhasa.so.0"

inherit rpm
