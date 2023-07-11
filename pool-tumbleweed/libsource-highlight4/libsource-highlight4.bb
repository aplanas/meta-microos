SUMMARY = "Source Code Highlighting C++ Library"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual). \
 \
libsource-highlight is a C++ library that provides the features of \
Source-highlight."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "libsource-highlight4-3.1.9-5.8.aarch64.rpm"
RPM_HASH = "390788d659d0fc724ac2125210cbcbbd6e0d66dd876095a64d1fe5ef652c6561235e803a646b2fba32a05e2d80b361e2bc2f20d738e620a570aed60d58463949"

RPROVIDES:${PN} += "libsource-highlight.so.4 \
libsource-highlight4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
