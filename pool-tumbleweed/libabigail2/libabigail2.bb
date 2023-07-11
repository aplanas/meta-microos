SUMMARY = "Application Binary Interface Generic Analysis and Instrumentation Library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences, and help build tools to infer \
interesting conclusions about these differences."
LICENSE = "LGPL-3.0-or-later"

PV = "2.3"

RPM_NAME = "libabigail2-2.3-1.1.aarch64.rpm"
RPM_HASH = "324ede6b1f8367bb86783a04c3cac37bcc953b1a7f0dadf016da9677e237800a99acb61c19984568084e0c55f2b2e07e3be47b78bb57b7f5690e3402583ed15b"

RPROVIDES:${PN} += "libabigail.so.2 \
libabigail2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
