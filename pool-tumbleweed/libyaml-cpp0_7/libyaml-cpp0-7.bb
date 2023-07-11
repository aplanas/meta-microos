SUMMARY = "YAML parser and emitter in C++"
DESCRIPTION = "A YAML parser and emitter in C++ matching the YAML 1.2 spec."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "libyaml-cpp0_7-0.7.0-2.2.aarch64.rpm"
RPM_HASH = "5ab5b04644681178e40efc0be345fa0147b1e2d8bd70c4019d59c39900502e8c100b7840f089564a900d490f24bcdb77d7548fa3140456d2487aa67b0375c7ad"

RPROVIDES:${PN} += "libyaml-cpp.so.0.7 \
libyaml-cpp0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
