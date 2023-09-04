SUMMARY = "YAML parser and emitter in C++"
DESCRIPTION = "A YAML parser and emitter in C++ matching the YAML 1.2 spec."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libyaml-cpp0_8-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "f10ed6efb52351c2c0817d585367aab876ab6898506ac19ae74be77b255e24fb70f8bcee80ded5a2033e0a383d80b79a25c52b87ad33b4f87fce517a9ed53ec4"

RPROVIDES:${PN} += "libyaml-cpp.so.0.8 \
libyaml-cpp0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
