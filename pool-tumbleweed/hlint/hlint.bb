SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.7.aarch64.rpm"
RPM_HASH = "b36fae9b6f0241019ff7209bb66c615bab279113778b8534d7251a3ff4520f61781ed0838b6574d2aa96c819d90f989a124d595b062eaa1d3b513a282316bf18"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
