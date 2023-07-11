SUMMARY = "A library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
ryml parses both read-only and in-situ source buffers; the resulting \
data nodes hold only views to sub-ranges of the source buffer. No \
string copies or duplications are done."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libryml0_5_0-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "cccc048600abd219ef63e95ac7c0cdb4ed8f0a7268f56745f34962dbfea7d4e51ce0471ded1fdfd833ab2a5da4a8e3b39c4df0669797ad2fcb14b5bbfef72191"

RPROVIDES:${PN} += "libryml.so.0.5.0 \
libryml0-5-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
