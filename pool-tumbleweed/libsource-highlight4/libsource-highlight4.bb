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

RPM_NAME = "libsource-highlight4-3.1.9-5.7.aarch64.rpm"
RPM_HASH = "1bb2a6467333c8b91e2eefa7f10274f938aa52cb858c613e08b4cace800ad47bb858348298958fb20b01ebffa7beb21176f580d82326037826847b442b07ee0b"

RPROVIDES:${PN} += "libsource-highlight.so.4 \
libsource-highlight4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
