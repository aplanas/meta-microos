SUMMARY = "Utility library of rapidyaml"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libc4core0_1_11-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "073468c0ba47e2bdfa253e4a0fded49b7c5ad6d880c70fadd117a17563a5bfda39e3ea3dd5ce970491cedea8c7be53d430892f783d704dca23f0faa03724fa2d"

RPROVIDES:${PN} += "libc4core.so.0.1.11 \
libc4core0-1-11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
