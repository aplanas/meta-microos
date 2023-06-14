SUMMARY = "YAML parser and emitter in C++"
DESCRIPTION = "A YAML parser and emitter in C++ matching the YAML 1.2 spec."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "libyaml-cpp0_7-0.7.0-2.1.aarch64.rpm"
RPM_HASH = "c28ba0d790ed46d782f3b3168a4d10f25ec60aabcbd218cd9ebd7b5614e9a798d7c04a2fe172d013359501425c4a68c0c199bdb191fef7722912d86f07a8d198"

RPROVIDES:${PN} += "libyaml-cpp.so.0.7 \
libyaml-cpp0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
